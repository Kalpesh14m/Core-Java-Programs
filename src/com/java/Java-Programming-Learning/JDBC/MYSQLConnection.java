/*
 * JDBC stands for Java Database Connectivity. 
 * JDBC is a Java API to connect and execute the query with the database. 
 * It is a part of JavaSE (Java Standard Edition). 
 * JDBC API uses JDBC drivers to connect with the database. 
 * There are four types of JDBC drivers:
 * 	1. JDBC-ODBC Bridge Driver,
 * 	2. Native Driver,
 *  3. Network Protocol Driver,
 *  4. Thin Driver
 * 
 * We can use JDBC API to access tabular data stored in any relational database. 
 * By the help of JDBC API, we can save, update, delete and fetch data from the database. 
 * It is like Open Database Connectivity (ODBC) provided by Microsoft.
 * 
 * The java.sql package contains classes and interfaces for JDBC API. 
 * A list of popular interfaces of JDBC API are given below: 
 * 		Driver interface
 * 		Connection interface
 * 		Statement interface
 * 		PreparedStatement interface
 * 		CallableStatement interface
 * 		ResultSet interface
 * 		ResultSetMetaData interface
 * 		DatabaseMetaData interface
 * 		RowSet interface

 * A list of popular classes of JDBC API are given below:
 * 		DriverManager class
 * 		Blob class
 * 		Clob class
 * 		Types class
 * 
 * We can use JDBC API to handle database using Java program and can perform the following activities:
 * 		Connect to the database
 * 		Execute queries and update statements to the database
 * 		Retrieve the result received from the database.
 * 
 * Java Database Connectivity with 5 Steps:

 * 		1. Register the Driver class:
 		The forName() method of Class class is used to register the driver class. 
 		This method is used to dynamically load the driver class.
			Syntax of forName() method:
				public static void forName(String className)throws ClassNotFoundException  
				
		Example to register the OracleDriver class:
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		Example to register the MySQL class:
			Class.forName("com.mysql.jdbc.Driver");

 * 		2. Create connection:
 		The getConnection() method of DriverManager class is used to establish connection with the database.
		Syntax of getConnection() method:
			1) public static Connection getConnection(String url)throws SQLException  
			2) public static Connection getConnection(String url,String name,String password)  
			throws SQLException  
			
		Example to establish connection with the Oracle database
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
 			
 		Example to establish connection with the MySQL database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

 * 		3. Create statement:
 		The createStatement() method of Connection interface is used to create statement. 
		The object of statement is responsible to execute queries with the database.
		Syntax of createStatement() method:
			public Statement createStatement()throws SQLException  
		
		Example to create the statement object:
			Statement stmt=con.createStatement();  

 *		4. Execute queries:
		The executeQuery() method of Statement interface is used to execute queries to the database. 
		This method returns the object of ResultSet that can be used to get all the records of a table.
		Syntax of executeQuery() method:
			public ResultSet executeQuery(String sql)throws SQLException  

		Example to execute query:
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next()){  
			System.out.println(rs.getInt(1)+" "+rs.getString(2));  
			} 
 		
 * 		5. Close connection:
		By closing connection object statement and ResultSet will be closed automatically. 
		The close() method of Connection interface is used to close the connection.
		Syntax of close() method:
			public void close()throws SQLException  
		
		Example to close connection:
			con.close();  

 * Note: Since Java 7, JDBC has ability to use try-with-resources statement to automatically close resources of type Connection, ResultSet, and Statement.
 * 
 * 
 * DriverManager class:
 * The DriverManager class acts as an interface between user and drivers. 
 * It keeps track of the drivers that are available and handles establishing a connection between a database and the appropriate driver. 
 * The DriverManager class maintains a list of Driver classes that have registered themselves by calling the method DriverManager.registerDriver().
 * 
 *  methods of DriverManager class:
		1) public static void registerDriver(Driver driver):	is used to register the given driver with DriverManager.
		2) public static void deregisterDriver(Driver driver):	is used to deregister the given driver (drop the driver from the list) with DriverManager.
		3) public static Connection getConnection(String url):	is used to establish the connection with the specified url.
		4) public static Connection getConnection(String url,String userName,String password): is used to establish the connection with the specified url, username and password.
 * 
 * 
 * Connection interface:
 * A Connection is the session between java application and database. 
 * The Connection interface is a factory of Statement, PreparedStatement, and DatabaseMetaData i.e. object of Connection can be used to get the object of Statement and DatabaseMetaData. 
 * The Connection interface provide many methods for transaction management like commit(), rollback() etc.
 * By default, connection commits the changes after executing queries.

 * Commonly used methods of Connection interface:
		1) public Statement createStatement(): creates a statement object that can be used to execute SQL queries.
		2) public Statement createStatement(int resultSetType,int resultSetConcurrency): Creates a Statement object that will generate ResultSet objects with the given type and concurrency.
		3) public void setAutoCommit(boolean status): is used to set the commit status.By default it is true.
		4) public void commit(): saves the changes made since the previous commit/rollback permanent.
		5) public void rollback(): Drops all changes made since the previous commit/rollback.
		6) public void close(): closes the connection and Releases a JDBC resources immediately.
 * 
 * Statement interface:
 * The Statement interface provides methods to execute queries with the database. 
 * The statement interface is a factory of ResultSet i.e. it provides factory method to get the object of ResultSet.
 * 
 * Commonly used methods of Statement interface:
		1) public ResultSet executeQuery(String sql): is used to execute SELECT query. It returns the object of ResultSet.
		2) public int executeUpdate(String sql): is used to execute specified query, it may be create, drop, insert, update, delete etc.
		3) public boolean execute(String sql): is used to execute queries that may return multiple results.
		4) public int[] executeBatch(): is used to execute batch of commands.
 * 
 * ResultSet interface:
 * The object of ResultSet maintains a cursor pointing to a row of a table. 
 * Initially, cursor points to before the first row.
 * By default, ResultSet object can be moved forward only and it is not updatable.
 * But we can make this object to move forward and backward direction by passing either TYPE_SCROLL_INSENSITIVE or TYPE_SCROLL_SENSITIVE in createStatement(int,int) method as well as we can make this object as updatable by:
 		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); 
 * Methods of ResultSet interface:
		1) public boolean next():	is used to move the cursor to the one row next from the current position.
		2) public boolean previous():	is used to move the cursor to the one row previous from the current position.
		3) public boolean first():	is used to move the cursor to the first row in result set object.
		4) public boolean last():	is used to move the cursor to the last row in result set object.
		5) public boolean absolute(int row):	is used to move the cursor to the specified row number in the ResultSet object.
		6) public boolean relative(int row):	is used to move the cursor to the relative row number in the ResultSet object, it may be positive or negative.
		7) public int getInt(int columnIndex):	is used to return the data of specified column index of the current row as int.
		8) public int getInt(String columnName):	is used to return the data of specified column name of the current row as int.
		9) public String getString(int columnIndex):	is used to return the data of specified column index of the current row as String.
		10) public String getString(String columnName):	is used to return the data of specified column name of the current row as String.
 * */

package com.java.kalpesh.JDBC;

import java.sql.*;

class MYSQLConnection {
	public static void main(String args[]) {
		try {
			// step1 load the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));

			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}