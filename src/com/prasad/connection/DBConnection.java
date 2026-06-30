package com.prasad.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	
	static Connection con = null;
	
	public static Connection Connect(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybank", "root", "") ;
			
			if(con == null){
				System.out.println("not connect..........");
			}
			else{
				System.out.println("connect............");
			}
		}
		catch(Exception e){
			
			System.out.println(e);
			e.printStackTrace();
			
		}
		
		
		
		
		return con;
		
	}

}
