package com.jdbc.demo;
import java.sql.*;


public class MySqlConnection {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcExample","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select *from emp");
			while(rs.next())
			
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
