package com.sg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
		  String url ="jdbc:mysql://localhost:3306/test";
		  Connection conn = DriverManager.getConnection(url,"root","root");
		  String sql = "update employee set emp_sal=? where emp_id=?";
	     PreparedStatement ps = conn.prepareStatement(sql);
	     ps.setDouble(1, 25000);
	     ps.setInt(2, 1002);
	     
	     int rows = ps.executeUpdate();
	    
	    	 System.out.println(rows+" rows affected");
	    	 
	     
	     conn.close();
	}

}
