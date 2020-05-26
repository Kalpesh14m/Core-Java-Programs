/*The instance of RowSet is the java bean component because it has properties and java bean notification mechanism. 
 * It is introduced since JDK 5.
 * It is the wrapper of ResultSet. 
 * It holds tabular data like ResultSet but it is easy and flexible to use.
 * The implementation classes of RowSet interface are as follows:
		JdbcRowSet
		CachedRowSet
		WebRowSet
		JoinRowSet
		FilteredRowSet
 * 
 * Advantage of RowSet:
		It is easy and flexible to use
		It is Scrollable and Updatable bydefault
 * */

package com.java.kalpesh.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSet {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		// Creating and Executing RowSet
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:mysql://localhost:3306/test");
		rowSet.setUsername("root");
		rowSet.setPassword("root");

		rowSet.setCommand("select * from emp");
		rowSet.execute();

		// Adding Listener and moving RowSet
		rowSet.addRowSetListener(new MyListener());

		while (rowSet.next()) {
			// Generating cursor Moved event
			System.out.println("Id: " + rowSet.getInt(1));
			System.out.println("Name: " + rowSet.getString(2));
			System.out.println("Salary: " + rowSet.getInt(3));
			System.out.println();
		}

	}
}

class MyListener implements RowSetListener {
	public void cursorMoved(RowSetEvent event) {
		System.out.println("Cursor Moved...");
	}

	public void rowChanged(RowSetEvent event) {
		System.out.println("Cursor Changed...");
	}

	public void rowSetChanged(RowSetEvent event) {
		System.out.println("RowSet changed...");
	}
}