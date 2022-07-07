package com.ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TicketDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	private static boolean isSuccess = false;

	public static boolean studentInsert(String name, String email, String regNo, String faculty, String phone, String type, String subject, String msg) {
				
		try {
			
            con = TicketDBConnect.getConnection();
            stmt = con.createStatement();
			
			String sql = "insert into ticket values(0,'"+name+"','"+email+"','"+regNo+"','"+faculty+"','"+phone+"','"+type+"','"+subject+"','"+msg+"',0)";
		    int rs =  stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	    
	    	    
	    return isSuccess;
	}
	
    public static boolean updateAnswer(String id,String ans) {
    	
    	int convID = Integer.parseInt(id);
    	
    	try {
    		
    		con = TicketDBConnect.getConnection();
    		stmt = con.createStatement();
    		
    		String sql = "update ticket set answer='"+ans+"' where id= '"+convID+"'";
    		
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs>0) {
    			isSuccess = true;
    		}else {
    			isSuccess = false;
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return isSuccess;
    }
    
    public static boolean deleteTicket(String id) {
    	
    	int convID = Integer.parseInt(id);
    	
    	try {
    		con = TicketDBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from ticket where id='"+convID+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs>0) {
    			isSuccess = true;
    		}else {
    			isSuccess = false;
    		}
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
}
