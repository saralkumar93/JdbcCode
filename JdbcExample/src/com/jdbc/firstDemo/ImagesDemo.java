package com.jdbc.firstDemo;

import java.sql.*;
import java.io.*;


public class ImagesDemo {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
			
			String q="insert into images(pic) values(?)";
			PreparedStatement stmt=con.prepareStatement(q);
			
			FileInputStream fis=new FileInputStream("D:\\pd photos\\mypic.jpg");
			stmt.setBinaryStream(1, fis,fis.available());
			
			stmt.executeUpdate();
			System.out.println("done.....");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error  !!");
		}
		
	}

}
