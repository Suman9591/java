package com.sg.ui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.sg.service.ExamSerImpl;
import com.sg.service.IExamSer;
import com.sg.vo.Question;

public class QuizUi {
	
	JFrame jf;
	JRadioButton r1,r2,r3;
	JLabel L1;
	JButton b1;
	JPanel jp,jp2;
	Container ct;
	ButtonGroup bg;
	private IExamSer ser = ExamSerImpl.getExamService();
	private List<Question> qlist = ser.genQuestions();
	private int i=0;
	private Map<Integer, String> amap = new HashMap<>();
	
	public QuizUi(){
		L1 = new JLabel(qlist.get(i).getQdesc());
		r1 = new JRadioButton(qlist.get(i).getOpta());
		r2 = new JRadioButton(qlist.get(i).getOptb());
		r3 = new JRadioButton(qlist.get(i).getOptc());
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		b1 = new JButton("next");
		b1.addActionListener(listen1);
		
		jp = new JPanel();
		jp.add(L1);
		jp.add(r1);
		jp.add(r2);
		jp.add(r3);
		jp.setLayout(new GridLayout(4,1,10,10));
		jp2 = new JPanel();
		jp2.add(b1);
		
		jf = new JFrame("Quiz App");
		ct = jf.getContentPane();
		ct.setLayout(new GridLayout(2,1,10,10));
		ct.add(jp);
		ct.add(jp2);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setSize(300,300);
		//jf.pack();
		
		
	}
	
	ActionListener listen1 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String ans = "";
			int score = 10;
			if(r1.isSelected())
				ans= r1.getText();
			else if(r2.isSelected())
				ans= r2.getText();
			else if(r3.isSelected())
				ans = r3.getText();
			amap.put(qlist.get(i).getQid(), ans);
			
			++i;
			if(i <=4){
			L1.setText(qlist.get(i).getQdesc());
			r1.setText(qlist.get(i).getOpta());
			r2.setText(qlist.get(i).getOptb());
			r3.setText(qlist.get(i).getOptc());
			}
			if(i==4)
				b1.setText("finish");
			
			if(i==5){
				 score = ser.getScore(amap);
			JOptionPane.showMessageDialog(jf, "You have scored = "+ score);
			}
			
		}
		
	};
		
		
	

	public static void main(String[] args) {
		new QuizUi();

	}

}