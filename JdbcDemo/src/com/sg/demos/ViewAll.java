package com.sg.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAll {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.jdbc.Driver");
	  String url ="jdbc:mysql://192.168.0.103:3306/test";
	  Connection conn = DriverManager.getConnection(url,"root","root");
	  String sql = "select * from employee";
     PreparedStatement ps = conn.prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
    	 System.out.println(rs.getInt("emp_id"));
    	 System.out.println(rs.getString("emp_name"));
    	 System.out.println(rs.getDouble("emp_sal"));
    	 System.out.println(rs.getString("emp_desig"));
    	 System.out.println("--------------------------------------------");
    	 
     }
     conn.close();
	}

}
