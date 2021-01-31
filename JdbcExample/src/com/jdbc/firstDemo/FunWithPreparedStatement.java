package com.jdbc.firstDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FunWithPreparedStatement {
	
	public static void main(String []args)
	{
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/youtube";
			String name="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url,name,password);
			String q="insert into table1(tName,tCity) values (?,?)";
			
			PreparedStatement pstmt =con.prepareStatement(q);
			
			pstmt.setString(1, "saral");
			pstmt.setString(2, "rajur"); 
			
			pstmt.executeUpdate();
			System.out.println("insert values successfully");
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
