package com.sg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AggDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
		  String url ="jdbc:mysql://localhost:3306/test";
		  Connection conn = DriverManager.getConnection(url,"root","root");
		  String sql = "select count(emp_id) no, sum(emp_sal) totsal, max(emp_sal) maxsal from employee";
	     PreparedStatement ps = conn.prepareStatement(sql);
	     ResultSet rs = ps.executeQuery();
	     while(rs.next()){
	    	 System.out.println("No of employee "+rs.getInt("no"));
	    	 System.out.println("Total salary "+rs.getDouble("totsal"));
	    	 System.out.println("Maximum salary "+rs.getDouble("maxsal"));
	    	 System.out.println("--------------------------------------------");
	    	 
	     }
	     conn.close();
	}

}