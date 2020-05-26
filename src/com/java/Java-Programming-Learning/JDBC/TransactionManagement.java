package com.java.kalpesh.JDBC;

import java.sql.*;

class TransactionManagement {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into emp values(15,'abhi',40)");
		stmt.executeUpdate("insert into emp values(16,'umesh',50)");

		con.commit();
		con.close();
	}
}