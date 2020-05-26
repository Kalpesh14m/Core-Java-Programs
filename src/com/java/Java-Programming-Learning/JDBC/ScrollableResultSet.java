package com.java.kalpesh.JDBC;

import java.sql.*;

class ScrollableResultSet {
	public static void main(String args[]) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = stmt.executeQuery("select * from emp");

		// getting the record of 3rd row
		rs.absolute(3);
		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));

		con.close();
	}
}