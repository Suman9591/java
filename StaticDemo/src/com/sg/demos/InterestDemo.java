package com.sg.demos;

import java.util.Scanner;

public class InterestDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle");
		double amt = scan.nextDouble();
		System.out.println("Enter the Years");
		int years = scan.nextInt();
		System.out.println("Enter the Rate");
		float rate = scan.nextFloat();
		double si = MyUtil.clacSimple(amt,years,rate);
		double ci = MyUtil.clacCompound(amt,years,rate);
		System.out.println("Simple Interest = "+ si);
		System.out.println("Compound Interest = "+ ci);
		scan.close();

	}

}
