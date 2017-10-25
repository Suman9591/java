package com.sg.client;

import java.util.Scanner;

import com.sg.service.Emp;

public class clientB {

	public static void main(String[] args) {
		Emp e1 = new Emp(1001, "ram");
		
			
		e1 = null;
		System.gc();
		new Scanner(System.in).next();
		System.out.println("line1...");
		System.out.println("line2...");
		

	}

}
