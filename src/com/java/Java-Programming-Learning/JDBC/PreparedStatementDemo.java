/*PreparedStatement interface:
 * The PreparedStatement interface is a subinterface of Statement. 
 * It is used to execute parameterized query.
 * Let's see the example of parameterized query:
	String sql="insert into emp values(?,?,?)";  
 
 * As you can see, we are passing parameter (?) for the values. 
 * Its value will be set by calling the setter methods of PreparedStatement.
 * 
 * 
 * Why use PreparedStatement?
 * ==> Improves performance: The performance of the application will be faster if you use PreparedStatement interface because query is compiled only once.
 * 
 * 
 * Methods of PreparedStatement interface:
		public void setInt(int paramIndex, int value)	sets the integer value to the given parameter index.
		public void setString(int paramIndex, String value)	sets the String value to the given parameter index.
		public void setFloat(int paramIndex, float value)	sets the float value to the given parameter index.
		public void setDouble(int paramIndex, double value)	sets the double value to the given parameter index.
		public int executeUpdate()	executes the query. It is used for create, drop, insert, update, delete etc.
		public ResultSet executeQuery()	executes the select query. It returns an instance of ResultSet.
*/

package com.java.kalpesh.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class PreparedStatementDemo {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			// Insert Records
			PreparedStatement insertStmt = con.prepareStatement("insert into emp values(?,?,?)");
			insertStmt.setInt(1, 10);// 1 specifies the first parameter in the
										// query
			insertStmt.setString(2, "Ratan");
			insertStmt.setInt(3, 33);

			int i = insertStmt.executeUpdate();
			System.out.println(i + " records inserted");

			// Update Records
			PreparedStatement updateStmt = con.prepareStatement("update emp set name=? where id=?");
			updateStmt.setString(1, "Bunty");// 1 specifies the first parameter
												// in the query i.e. name
			updateStmt.setInt(2, 1);

			i = updateStmt.executeUpdate();
			System.out.println(i + " records updated");

			// Delete Records
			PreparedStatement deleteStmt = con.prepareStatement("delete from emp where id=?");
			deleteStmt.setInt(1, 10);

			i = deleteStmt.executeUpdate();
			System.out.println(i + " records deleted");

			// Select Records
			PreparedStatement stmt = con.prepareStatement("select * from emp");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}