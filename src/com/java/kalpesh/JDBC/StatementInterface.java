package com.java.kalpesh.JDBC;

import java.sql.*;

class StatementInterface {
	public static void main(String args[]) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from emp");

		int insertResult = stmt.executeUpdate("insert into emp values(4,'Akshy',24)");
		int updateResult = stmt.executeUpdate("update emp set name='Bhushan', age=26 where id=3");
		int deleteResult = stmt.executeUpdate("delete from emp where id=2");

		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));

		System.out.println(insertResult + " records affected");
		System.out.println(updateResult + " records affected");
		System.out.println(deleteResult + " records affected");
		con.close();
	}
}