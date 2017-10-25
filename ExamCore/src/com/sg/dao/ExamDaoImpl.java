package com.sg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import com.sg.vo.Question;

public class ExamDaoImpl implements IExamDao{
    public static ResourceBundle rb = ResourceBundle.getBundle("sg");
    private static IExamDao dao = new ExamDaoImpl();
    private ExamDaoImpl(){
    	
    }
    public static IExamDao getExamDao(){
    	return dao;
    }
    static{
    	try {
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    }
	@Override
	public Map<Integer, Question> getQuestions() {
		Map<Integer, Question> qmap = new HashMap<>();
		Question ques = null;
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(rb.getString("url"),
					rb.getString("uname"),rb.getString("pwd"));
			String sql = "select * from questions";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ques = new Question();
				ques.setQid(rs.getInt("qid"));
				ques.setQdesc(rs.getString("qdesc"));
				ques.setOpta(rs.getString("opta"));
				ques.setOptb(rs.getString("optb"));
				ques.setOptc(rs.getString("optc"));
				//ques.setOptd(rs.getString("optd"));
				ques.setRes(rs.getString("res"));
				qmap.put(ques.getQid(), ques);
			}
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			
		}
		finally{
			closeConn(conn);
		}
		return qmap;
	}
	public void closeConn(Connection conn){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
