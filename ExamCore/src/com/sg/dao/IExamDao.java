package com.sg.dao;

import java.util.Map;

import com.sg.vo.Question;

public interface IExamDao {
	Map<Integer, Question> getQuestions();

}
