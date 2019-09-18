/*Java DatabaseMetaData interface:
 * DatabaseMetaData interface provides methods to get meta data of a database such as database product name, database product version, driver name, name of total number of tables, name of total number of views etc.
 * 
 * Methods of DatabaseMetaData interface
		public String getDriverName()throws SQLException: it returns the name of the JDBC driver.
		public String getDriverVersion()throws SQLException: it returns the version number of the JDBC driver.
		public String getUserName()throws SQLException: it returns the username of the database.
		public String getDatabaseProductName()throws SQLException: it returns the product name of the database.
		public String getDatabaseProductVersion()throws SQLException: it returns the product version of the database.
		public ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types)throws SQLException: it returns the description of the tables of the specified catalog. The table type can be TABLE, VIEW, ALIAS, SYSTEM TABLE, SYNONYM etc.
 * 
 * */

package com.java.kalpesh.JDBC;

import java.sql.*;

class DatabaseMetaDataDemo {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

			String table[] = { "TABLE" };
			ResultSet tableRS = dbmd.getTables(null, null, null, table);

			while (tableRS.next()) {
				System.out.println("Table==> " + tableRS.getString(3));
			}

			String view[] = { "VIEW" };
			ResultSet viewRS = dbmd.getTables(null, null, null, view);

			while (viewRS.next()) {
				System.out.println("View==> " + viewRS.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}