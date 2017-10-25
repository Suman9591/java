package com.sg.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sg.vo.Emp;

public class EmpJdbcDao implements Idao {
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Emp> getEmployee() {
		System.out.println("Fetch from DB");
	    List<Emp> lst = new ArrayList<Emp>();
	    Connection conn = null;
	    String url ="jdbc:mysql://localhost:3306/test";
	    Emp emp = null;
	    try {
			conn = DriverManager.getConnection(url,"root","root");
			PreparedStatement st =  conn.prepareStatement("select * from employee");
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				emp = new Emp(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getDouble("emp_sal"));
				lst.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeConn(conn);
		}
		return lst;
	}
	
	public void closeConn(Connection conn){
		if(conn != null)
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
	}

}
