package com.sg.service;

import java.util.List;
import java.util.Map;

import com.sg.vo.AnswerObject;
import com.sg.vo.Question;

public interface IExamSer {
	 List<Question> genQuestions();
	 int getScore(Map<Integer,String> amap);
	

}
