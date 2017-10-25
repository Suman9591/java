package com.sg.demos;

import java.util.ResourceBundle;

public class StaticBlockDemo {
	
	public static final String UNAME;
	public static ResourceBundle rb;
	static{
		System.out.println("Static block");
		rb = ResourceBundle.getBundle("sg");
		UNAME = rb.getString("uname");
	}
	public static void main(String[] args) {
		
			System.out.println("Main method");
			System.out.println(UNAME);
		
	}
	

}
