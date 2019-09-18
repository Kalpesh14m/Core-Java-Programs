package com.java.kalpesh.JDBC;

import java.sql.*;

public class CallableStatementDemo {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		CallableStatement stmt = con.prepareCall("{call insertR(?,?)}");
		stmt.setInt(1, 10);
		stmt.setString(2, "Amit");
		stmt.execute();

		System.out.println("success");
	}
}