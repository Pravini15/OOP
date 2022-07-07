package com.ticket;

import java.sql.Connection;
import java.sql.DriverManager;

public class TicketDBConnect {

	 private static String url = "jdbc:mysql://localhost:3308/ticket";
	 private static String userName = "root";
	 private static String password = "gOoglelk50";
	 private static Connection con;
	 
	 public static Connection getConnection() {
		 
		 try {
			 
			 Class.forName("com.mysql.jdbc.Driver");
				
		     con = DriverManager.getConnection(url,userName,password);
		 
		 }catch(Exception e){
			 
			 System.out.println("Database connection is not successful");
		 }
		 
		 return con;
	 }
}
