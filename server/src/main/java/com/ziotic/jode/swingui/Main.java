/*
 * Copyright (c) 2024 Lazaro Brito
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ziotic.jode.swingui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import javax.swing.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import com.ziotic.jode.GlobalOptions;
import com.ziotic.jode.decompiler.Decompiler;
import com.ziotic.jode.decompiler.ProgressListener;

public class Main implements ActionListener, Runnable, TreeSelectionListener {
    Decompiler decompiler;
    JFrame frame;
    JTree classTree;
    JPanel statusLine;
    PackagesTreeModel packModel;
    HierarchyTreeModel hierModel;
    JTextArea sourcecodeArea, errorArea;
    Thread decompileThread;
    String currentClassPath, lastClassName;

    JProgressBar progressBar;

    boolean hierarchyTree;

    public Main(String classpath) {
        decompiler = new Decompiler();
        setClassPath(classpath);
        frame = new JFrame(GlobalOptions.copyright);
        fillContentPane(frame.getContentPane());
        addMenu(frame);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void show() {
        frame.pack();
        frame.show();
    }

    public void fillContentPane(Container contentPane) {
        statusLine = new JPanel();
        hierarchyTree = false;
        packModel = new PackagesTreeModel(this);
        hierModel = null;
        Font monospaced = new Font("monospaced", Font.PLAIN, 12);
        classTree = new JTree(packModel);
        classTree.setRootVisible(false);
        DefaultTreeSelectionModel selModel = new DefaultTreeSelectionModel();
        selModel.setSelectionMode(selModel.SINGLE_TREE_SELECTION);
        classTree.setSelectionModel(selModel);
        classTree.addTreeSelectionListener(this);
        JScrollPane spClassTree = new JScrollPane(classTree);
        sourcecodeArea = new JTextArea(20, 80);
        sourcecodeArea.setEditable(false);
        sourcecodeArea.setFont(monospaced);
        JScrollPane spText = new JScrollPane(sourcecodeArea);
        errorArea = new JTextArea(3, 80);
        errorArea.setEditable(false);
        errorArea.setFont(monospaced);
        JScrollPane spError = new JScrollPane(errorArea);

        JSplitPane rightPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, spText, spError);
        JSplitPane allPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, spClassTree, rightPane);
        contentPane.setLayout(new BorderLayout());
        contentPane.add(allPane, BorderLayout.CENTER);
        contentPane.add(statusLine, BorderLayout.SOUTH);
        progressBar = new JProgressBar();
        statusLine.add(progressBar);
        rightPane.setDividerLocation(300);
        rightPane.setDividerSize(4);
        allPane.setDividerLocation(200);
        allPane.setDividerSize(4);
        decompiler.setErr(new PrintWriter(new BufferedWriter(new AreaWriter(errorArea)), true));
    }

    public synchronized void valueChanged(TreeSelectionEvent e) {
        if (decompileThread != null)
            return;
        TreePath path = e.getNewLeadSelectionPath();
        if (path == null)
            return;
        Object node = path.getLastPathComponent();
        if (node != null) {
            if (hierarchyTree && hierModel.isValidClass(node))
                lastClassName = hierModel.getFullName(node);
            else if (!hierarchyTree && packModel.isValidClass(node))
                lastClassName = packModel.getFullName(node);
            else
                return;

            startDecompiler();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == classTree)
            startDecompiler();
    }

    public synchronized void startDecompiler() {
        if (decompileThread == null) {
            decompileThread = new Thread(this);
            decompileThread.setPriority(Thread.MIN_PRIORITY);

            progressBar.setMinimum(0);
            progressBar.setMaximum(1000);
            progressBar.setString("decompiling");
            progressBar.setStringPainted(true);
            decompileThread.start();
        }
    }

    public class AreaWriter extends Writer {
        boolean initialized = false;
        boolean lastCR = false;
        private JTextArea area;

        public AreaWriter(JTextArea a) {
            area = a;
        }

        public void write(char[] b, int off, int len) throws IOException {
            /* Note that setText and append are thread safe! */
            if (!initialized) {
                area.setText("");
                initialized = true;
            }
            String str = new String(b, off, len);
            StringBuffer sb = new StringBuffer(len);
            while (str != null && str.length() > 0) {
                if (lastCR && str.charAt(0) == '\n')
                    str = str.substring(1);
                int crIndex = str.indexOf('\r');
                if (crIndex >= 0) {
                    sb.append(str.substring(0, crIndex));
                    sb.append("\n");
                    str = str.substring(crIndex + 1);
                    lastCR = true;
                } else {
                    sb.append(str);
                    str = null;
                }
            }
            area.append(sb.toString());
        }

        public void flush() {
        }

        public void close() {
        }
    }

    public void run() {
        errorArea.setText("");
        Writer writer = new BufferedWriter(new AreaWriter(sourcecodeArea), 1024);

        ProgressListener progListener = new ProgressListener() {
            public void updateProgress(final double progress, final String detail) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        progressBar.setValue((int) (1000 * progress));
                        progressBar.setString(detail);
                    }
                });
            }
        };
        try {
            decompiler.decompile(lastClassName, writer, progListener);
        } catch (Throwable t) {
            try {
                writer.write("\nException while decompiling:");
                PrintWriter pw = new PrintWriter(writer);
                t.printStackTrace(pw);
                pw.flush();
            } catch (IOException ex) {
                /* Shouldn't happen, complain to stderr */
                ex.printStackTrace();
            }
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                /* ignore */
            }
            synchronized (this) {
                decompileThread = null;
            }
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                progressBar.setValue(0);
                progressBar.setString("");
            }
        });
    }

    public void addMenu(JFrame frame) {
        JMenuBar bar = new JMenuBar();
        JMenu menu;
        JMenuItem item;
        menu = new JMenu("File");
        item = new JMenuItem("Garbage collect");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.gc();
                System.runFinalization();
            }
        });
        menu.add(item);
        item = new JMenuItem("Exit");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.exit(0);
            }
        });
        menu.add(item);
        bar.add(menu);
        menu = new JMenu("Options");
        final JCheckBoxMenuItem hierItem = new JCheckBoxMenuItem("Class hierarchy", hierarchyTree);
        hierItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                hierarchyTree = hierItem.isSelected();
                if (hierarchyTree && hierModel == null) {
                    hierModel = new HierarchyTreeModel(Main.this, progressBar);
                    reselect();
                }
                classTree.setModel(hierarchyTree ? (TreeModel) hierModel : packModel);
                if (lastClassName != null) {
                    TreePath lastPath = (hierarchyTree ? hierModel.getPath(lastClassName) : packModel.getPath(lastClassName));
                    classTree.setSelectionPath(lastPath);
                    classTree.scrollPathToVisible(lastPath);
                }
            }
        });
        menu.add(hierItem);
        menu.add(new JSeparator());
        item = new JMenuItem("Set classpath...");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {

                String newClassPath = (String) JOptionPane.showInputDialog(null, "New classpath:", null, JOptionPane.QUESTION_MESSAGE, null, null, currentClassPath);
                if (newClassPath != null && !newClassPath.equals(currentClassPath))
                    setClassPath(newClassPath);
            }
        });
        menu.add(item);
        item = new JMenuItem("Reload classpath");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                setClassPath(currentClassPath);
            }
        });
        menu.add(item);
        bar.add(menu);
        frame.setJMenuBar(bar);
    }

    public void setClassPath(String classpath) {
        if (classpath == null || classpath.length() == 0)
            classpath = ".";
        currentClassPath = classpath;
        com.ziotic.jode.bytecode.ClassInfo.setClassPath(classpath);
        decompiler.setClassPath(classpath);
        if (classTree != null)
            classTree.clearSelection();
        if (packModel != null)
            packModel.rebuild();
        if (hierModel != null && hierarchyTree) {
            hierModel.rebuild();
        } else {
            hierModel = null;
        }
    }

    public void treeNodesChanged(TreeModelEvent e) {
        reselect();
    }

    public void treeNodesInserted(TreeModelEvent e) {
        reselect();
    }

    public void treeNodesRemoved(TreeModelEvent e) {
        reselect();
    }

    public void treeStructureChanged(TreeModelEvent e) {
        reselect();
    }

    public void reselect() {
        if (lastClassName != null) {
            TreePath lastPath = (hierarchyTree ? hierModel.getPath(lastClassName) : packModel.getPath(lastClassName));
            if (lastPath != null) {
                classTree.setSelectionPath(lastPath);
                classTree.scrollPathToVisible(lastPath);
            }
        }
    }

    public static void usage() {
        System.err.println("Usage: java jode.swingui.Main [CLASSPATH]");
        System.err.println("The directories in CLASSPATH should be separated by ','.");
        System.err.println("If no CLASSPATH is given the virtual machine classpath is used.");
    }

    public static void main(String[] params) {
        String cp = System.getProperty("java.class.path", "");
        cp = cp.replace(File.pathSeparatorChar, Decompiler.altPathSeparatorChar);
        String bootClassPath = System.getProperty("sun.boot.class.path");
        if (bootClassPath != null)
            cp += Decompiler.altPathSeparatorChar + bootClassPath.replace(File.pathSeparatorChar, Decompiler.altPathSeparatorChar);
        int i = 0;
        if (i < params.length) {
            if (params[i].equals("--classpath") || params[i].equals("--cp") || params[i].equals("-c"))
                cp = params[++i];
            else if (params[i].startsWith("-")) {
                if (!params[i].equals("--help") && !params[i].equals("-h"))
                    System.err.println("Unknown option: " + params[i]);
                usage();
                return;
            } else
                cp = params[i];
            i++;
        }
        if (i < params.length) {
            System.err.println("Too many arguments.");
            usage();
            return;
        }
        Main win = new Main(cp);
        win.show();
    }
}
