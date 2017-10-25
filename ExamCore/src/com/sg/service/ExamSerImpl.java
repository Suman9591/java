package com.sg.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sg.dao.ExamDaoImpl;
import com.sg.dao.IExamDao;
import com.sg.vo.AnswerObject;
import com.sg.vo.Question;

public class ExamSerImpl implements IExamSer{
	
	private static Map<Integer, Question> qmap;
    private IExamDao dao = ExamDaoImpl.getExamDao();
    private static IExamSer ser = new ExamSerImpl();
    private ExamSerImpl(){
    	
    }
    public static IExamSer getExamService(){
    	return ser;
    }
	@Override
	public List<Question> genQuestions() {
		List<Question> qlist = new ArrayList<>();
		if(qmap == null)
			qmap = dao.getQuestions();
		Set<Integer> qset = genQnos();
		for(int qno: qset){
			qlist.add(qmap.get(qno));
		}
		return qlist;
	}


	public int getScore(Map<Integer, String> amap) {
		Set<Integer> aset = amap.keySet();
		Question ques = null;
		String str =null;
		int score = 0;
		for(int qid: aset){
			ques = qmap.get(qid);
			str = amap.get(qid);
			if(str.equals(ques.getRes()))
				++score;
		}
		return score;
	}
	
	public Set<Integer> genQnos(){
		Set<Integer> set = new  HashSet<Integer>();
		int no = 0;
		while(set.size()<5){
			no = (int)(Math.random()*15);
			if(no>0)
				set.add(no);
		}
		return set;
	}

}
