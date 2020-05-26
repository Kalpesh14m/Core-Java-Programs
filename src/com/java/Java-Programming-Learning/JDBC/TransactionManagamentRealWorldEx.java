package com.java.kalpesh.JDBC;

import java.sql.*;
import java.io.*;

class TransactionManagamentRealWorldEx {
	public static void main(String args[]) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {

				System.out.println("enter id");
				String s1 = br.readLine();
				int id = Integer.parseInt(s1);

				System.out.println("enter name");
				String name = br.readLine();

				System.out.println("enter age");
				String s3 = br.readLine();
				int age = Integer.parseInt(s3);

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, age);
				ps.executeUpdate();

				System.out.println("1.c for commit\n2. r for rollback");
				String answer = br.readLine();
				if (answer.equals("c")) {
					con.commit();
				}
				if (answer.equals("r")) {
					con.rollback();
				}

				System.out.println("Want to add more records y/n");
				String ans = br.readLine();
				if (ans.equals("n")) {
					break;
				}

			}
			con.commit();
			System.out.println("record successfully saved");

			con.close();// before closing connection commit() is called
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}