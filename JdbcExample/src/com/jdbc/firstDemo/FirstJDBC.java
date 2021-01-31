package com.jdbc.firstDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC {
	
	public static void main(String [] args)
	{
		
		try
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create connection
			String url= "jdbc:mysql://loacalhost:3306/youtube";
			String username="root";
			String password="root";
			Connection con =DriverManager.getConnection(url,username,password);
			
			if(con.isClosed())
			{
				System.out.println("connection is closed");
			}else
			{
				System.out.println("connection is created");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
