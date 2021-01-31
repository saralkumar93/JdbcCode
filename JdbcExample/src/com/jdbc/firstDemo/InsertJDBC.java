package com.jdbc.firstDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {
	
	public static void main(String[] args) {
		
		try
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create connection
			String url= "jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="root";
			Connection con =DriverManager.getConnection(url,username,password);
			
			// create a query
			
			String q="create table table1(tId int (20) primary key auto_increment, "
					+ "tName varchar(200) not null,tCity varchar(400))";
			
			// create statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table creted in database ");
			con.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
