/* Java ResultSetMetaData Interface:
 * The metadata means data about data i.e. we can get further information from the data.
 * If you have to get metadata of a table like total number of column, column name, column type etc. , ResultSetMetaData interface is useful because it provides methods to get metadata from the ResultSet object.
 * 
 * Methods of ResultSetMetaData interface:
		public int getColumnCount()throws SQLException	it returns the total number of columns in the ResultSet object.
		public String getColumnName(int index)throws SQLException	it returns the column name of the specified column index.
		public String getColumnTypeName(int index)throws SQLException	it returns the column type name for the specified index.
		public String getTableName(int index)throws SQLException	it returns the table name for the specified column index.
 * 
 * */

package com.java.kalpesh.JDBC;

import java.sql.*;

class ResultSetMetaDataDemo {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			PreparedStatement ps = con.prepareStatement("select * from emp");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println("Total columns: " + rsmd.getColumnCount());
			System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
			System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}