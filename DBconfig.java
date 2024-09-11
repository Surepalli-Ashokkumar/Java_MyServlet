package com.cisco.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconfig 
{
static Connection getConnection() {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/cisco";
		String username="root";
		String password="Ashok@123!";
		
		Connection conn=null;
		
		try {
			Class.forName(driver);
			conn= DriverManager.getConnection(url,username,password);
			
			if(conn!=null)
				return conn;
			else 
				return null;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return conn;
		
		
	}
}  
