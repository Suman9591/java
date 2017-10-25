package com.sg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewByDesignation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
		  String url ="jdbc:mysql://localhost:3306/test";
		  Connection conn = DriverManager.getConnection(url,"root","root");
		  String sql = "select * from employee where emp_design=?";
	     PreparedStatement ps = conn.prepareStatement(sql);
	     ps.setString(1, "hr");
	     ResultSet rs = ps.executeQuery();
	     while(rs.next()){
	    	 System.out.println(rs.getInt("emp_id"));
	    	 System.out.println(rs.getString("emp_name"));
	    	 System.out.println(rs.getDouble("emp_sal"));
	    	 System.out.println(rs.getString("emp_design"));
	    	 System.out.println("--------------------------------------------");
	    	 
	     }
	     conn.close();

	}

}
