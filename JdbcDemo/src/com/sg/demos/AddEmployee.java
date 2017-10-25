package com.sg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddEmployee {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
		  String url ="jdbc:mysql://localhost:3306/test";
		  Connection conn = DriverManager.getConnection(url,"root","root");
		  String sql = "insert into employee values(?,?,?,?)";
	     PreparedStatement ps = conn.prepareStatement(sql);
	     ps.setInt(1, 1007);
	     ps.setString(2, "Rammi");
	     ps.setDouble(3, 7000);
	     ps.setString(4, "hr");
	     int rows = ps.executeUpdate();
	    
	    	 System.out.println(rows+" rows affected");
	    	 
	     
	     conn.close();
	}

}
