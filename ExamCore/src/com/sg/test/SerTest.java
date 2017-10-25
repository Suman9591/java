package com.sg.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sg.service.ExamSerImpl;
import com.sg.service.IExamSer;
import com.sg.vo.Question;

public class SerTest {

	public static void main(String[] args) {
		IExamSer ser = ExamSerImpl.getExamService();
		Scanner scan = new Scanner(System.in);
		List<Question> qlist = ser.genQuestions();
		String ans = null;
		Map<Integer, String> amap = new HashMap<Integer, String>();
		for(Question q: qlist){
			System.out.println(q.getQdesc());
			System.out.println(q.getOpta());
			System.out.println(q.getOptb());
			System.out.println(q.getOptc());
			ans = scan.next();
			amap.put(q.getQid(), ans);
		}
		System.out.println("You have scored = " +ser.getScore(amap));

	}

}
