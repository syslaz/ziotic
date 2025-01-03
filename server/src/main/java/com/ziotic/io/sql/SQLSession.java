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
package com.ziotic.io.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.ziotic.utility.Configuration;
import com.ziotic.utility.Poolable;

/**
 * @author Lazaro
 */
public class SQLSession implements Poolable {
  private static boolean loadedDriver = false;

  private Configuration cfg;
  private Connection connection;

  public Connection getConnection() {
    return connection;
  }

  public Configuration cfg() {
    return cfg;
  }

  public synchronized Statement createStatement() throws SQLException {
    try {
      Statement statement = connection.createStatement();
      return statement;
    } catch (SQLException e) {
      throw e;
    }
  }

  public void init(Configuration configuration)
      throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
    this.cfg = configuration;

    // Set up the properties
    Properties properties = new Properties();
    properties.put("user", configuration.getString("sql_user"));
    properties.put("password", configuration.getString("sql_pass"));
    properties.put("autoReconnect", configuration.getString("sql_reconnect"));
    properties.put("maxReconnects", configuration.getString("sql_max_reconnects"));

    if (!loadedDriver) {
      // Load the SQL driver
      Class.forName(configuration.getString("sql_driver")).newInstance();
      loadedDriver = true;
    }

    // Connect to the server
    connection = DriverManager.getConnection(configuration.getString("sql_host"), properties);

    createStatement().execute("use " + configuration.getString("sql_database"));
  }

  @Override
  public boolean expired() {
    try {
      return connection.isClosed() || !connection.isValid(100);
    } catch (SQLException ex) {
      return false;
    }
  }

  @Override
  public void recycle() {
  }
}
