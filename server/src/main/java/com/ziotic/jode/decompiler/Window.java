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
package com.ziotic.jode.decompiler;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

import com.ziotic.jode.GlobalOptions;

///#ifndef AWT10
///#endif

public class Window implements Runnable
///#ifndef AWT10
        , ActionListener
///#endif

{
    TextField classpathField, classField;
    TextArea sourcecodeArea, errorArea;
    Checkbox verboseCheck, prettyCheck;
    Button startButton, saveButton;
    String lastClassName, lastClassPath;
    Frame frame;

    PrintWriter errStream;
    Decompiler decompiler = new Decompiler();
    Thread decompileThread;

    public Window(Container window) {
        buildComponents(window);
    }

    private void buildComponents(Container window) {
        if (window instanceof Frame)
            frame = (Frame) window;

        window.setFont(new Font("dialog", Font.PLAIN, 10));

        classpathField = new TextField(50);
        classField = new TextField(50);
        sourcecodeArea = new TextArea(20, 80);
        errorArea = new TextArea(3, 80);
        verboseCheck = new Checkbox("verbose", true);
        prettyCheck = new Checkbox("pretty", true);
        startButton = new Button("start");
        saveButton = new Button("save");
///#ifdef AWT10
///	saveButton.disable();
///#else
        saveButton.setEnabled(false);
///#endif

        sourcecodeArea.setEditable(false);
        errorArea.setEditable(false);
        Font monospaced = new Font("monospaced", Font.PLAIN, 10);
        sourcecodeArea.setFont(monospaced);
        errorArea.setFont(monospaced);

        GridBagLayout gbl = new GridBagLayout();
        window.setLayout(gbl);
        GridBagConstraints labelConstr = new GridBagConstraints();
        GridBagConstraints textConstr = new GridBagConstraints();
        GridBagConstraints areaConstr = new GridBagConstraints();
        GridBagConstraints checkConstr = new GridBagConstraints();
        GridBagConstraints buttonConstr = new GridBagConstraints();
        labelConstr.fill = GridBagConstraints.NONE;
        textConstr.fill = GridBagConstraints.HORIZONTAL;
        areaConstr.fill = GridBagConstraints.BOTH;
        checkConstr.fill = GridBagConstraints.NONE;
        buttonConstr.fill = GridBagConstraints.NONE;
        labelConstr.anchor = GridBagConstraints.EAST;
        textConstr.anchor = GridBagConstraints.CENTER;
        checkConstr.anchor = GridBagConstraints.WEST;
        buttonConstr.anchor = GridBagConstraints.CENTER;
        labelConstr.anchor = GridBagConstraints.EAST;
        textConstr.gridwidth = GridBagConstraints.REMAINDER;
        textConstr.weightx = 1.0;
        areaConstr.gridwidth = GridBagConstraints.REMAINDER;
        areaConstr.weightx = 1.0;
        areaConstr.weighty = 1.0;

///#ifdef AWT10
///	Label label = new Label("class path: ");
///	gbl.setConstraints(label, labelConstr);
///	window.add(label);
///	gbl.setConstraints(classpathField, textConstr);
///	window.add(classpathField);
///	label = new Label("class name: ");
///	gbl.setConstraints(label, labelConstr);
///	window.add(label);
///	gbl.setConstraints(classField, textConstr);
///	window.add(classField);
///	gbl.setConstraints(verboseCheck, checkConstr);
///	window.add(verboseCheck);
///	gbl.setConstraints(prettyCheck, checkConstr);
///	window.add(prettyCheck);
///	labelConstr.weightx = 1.0;
///	label = new Label();
///	gbl.setConstraints(label, labelConstr);
///	window.add(label);
///	gbl.setConstraints(startButton, buttonConstr);
///	window.add(startButton);
///	buttonConstr.gridwidth = GridBagConstraints.REMAINDER;
///	gbl.setConstraints(saveButton, buttonConstr);
///	window.add(saveButton);
///	gbl.setConstraints(sourcecodeArea, areaConstr);
///	window.add(sourcecodeArea);
///	areaConstr.gridheight = GridBagConstraints.REMAINDER;
///	areaConstr.weighty = 0.0;
///	gbl.setConstraints(errorArea, areaConstr);
///	window.add(errorArea);
///#else
        window.add(new Label("class path: "), labelConstr);
        window.add(classpathField, textConstr);
        window.add(new Label("class name: "), labelConstr);
        window.add(classField, textConstr);
        window.add(verboseCheck, checkConstr);
        window.add(prettyCheck, checkConstr);
        labelConstr.weightx = 1.0;
        window.add(new Label(), labelConstr);
        window.add(startButton, buttonConstr);
        buttonConstr.gridwidth = GridBagConstraints.REMAINDER;
        window.add(saveButton, buttonConstr);
        window.add(sourcecodeArea, areaConstr);
        areaConstr.gridheight = GridBagConstraints.REMAINDER;
        areaConstr.weighty = 0.0;
        window.add(errorArea, areaConstr);

        startButton.addActionListener(this);
        saveButton.addActionListener(this);
///#endif
        errStream = new PrintWriter(new AreaWriter(errorArea));
        decompiler.setErr(errStream);
    }

    public void setClassPath(String cp) {
        classpathField.setText(cp);
    }

    public void setClass(String cls) {
        classField.setText(cls);
    }

    ///#ifdef AWT10
///    public synchronized void action(Event e, Object target) {
///#else
    public synchronized void actionPerformed(ActionEvent e) {
        Object target = e.getSource();
///#endif
        if (target == startButton) {

///#ifdef AWT10
///	    startButton.disable();
///#else
            startButton.setEnabled(false);
///#endif
            decompileThread = new Thread(this);
            sourcecodeArea.setText("Please wait, while decompiling...\n");
            decompileThread.start();
        } else if (target == saveButton) {
            if (frame == null)
                frame = new Frame(); //XXX
            FileDialog fd = new FileDialog(frame, "Save decompiled code", FileDialog.SAVE);
            fd.setFile(lastClassName.substring(lastClassName.lastIndexOf('.') + 1).concat(".java"));
            fd.show();
            String fileName = fd.getFile();
            if (fileName == null)
                return;
            try {
                File f = new File(new File(fd.getDirectory()), fileName);
                FileWriter out = new FileWriter(f);
                out.write(sourcecodeArea.getText());
                out.close();
            } catch (IOException ex) {
                errorArea.setText("");
                errStream.println("Couldn't write to file " + fileName + ": ");
                ex.printStackTrace(errStream);
            } catch (SecurityException ex) {
                errorArea.setText("");
                errStream.println("Couldn't write to file " + fileName + ": ");
                ex.printStackTrace(errStream);
            }
        }
    }

    public class AreaWriter extends Writer {
        boolean initialized = false;
        private TextArea area;

        public AreaWriter(TextArea a) {
            area = a;
        }

        public void write(char[] b, int off, int len) throws IOException {
            if (!initialized) {
                area.setText("");
                initialized = true;
            }
///#ifdef AWT10
///	    area.appendText(new String(b, off, len));
///#else
            area.append(new String(b, off, len));
///#endif
        }

        public void flush() {
        }

        public void close() {
        }
    }

    public void run() {
        decompiler.setOption("verbose", verboseCheck.getState() ? "1" : "0");
        decompiler.setOption("pretty", prettyCheck.getState() ? "1" : "0");
        errorArea.setText("");
///#ifdef AWT10
///	saveButton.disable();
///#else
        saveButton.setEnabled(false);
///#endif

        lastClassName = classField.getText();
        String newClassPath = classpathField.getText();
        if (!newClassPath.equals(lastClassPath)) {
            decompiler.setClassPath(newClassPath);
            lastClassPath = newClassPath;
        }

        try {
            Writer writer = new BufferedWriter(new AreaWriter(sourcecodeArea), 512);
            try {
                decompiler.decompile(lastClassName, writer, null);
            } catch (IllegalArgumentException ex) {
                sourcecodeArea.setText("`" + lastClassName + "' is not a class name.\n" + "You have to give a full qualified classname " + "with '.' as package delimiter \n" + "and without .class ending.");
                return;
            }
///#ifdef AWT10
///	    saveButton.enable();
///#else
            saveButton.setEnabled(true);
///#endif
        } catch (Throwable t) {
            sourcecodeArea.setText("Didn't succeed.\n" + "Check the below area for more info.");
            t.printStackTrace();
        } finally {
            synchronized (this) {
                decompileThread = null;
///#ifdef AWT10
///		startButton.enable();
///#else
                startButton.setEnabled(true);
///#endif
            }
        }
    }

    public static void main(String argv[]) {
        Frame frame = new Frame(GlobalOptions.copyright);
        Window win = new Window(frame);

        String cp = System.getProperty("java.class.path");
        if (cp != null)
            win.setClassPath(cp.replace(File.pathSeparatorChar, Decompiler.altPathSeparatorChar));
        String cls = win.getClass().getName();
        win.setClass(cls);

///#ifndef AWT10
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
///#endif
        frame.pack();
        frame.show();
    }
}
