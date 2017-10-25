package com.sg.client;

import java.util.Scanner;

import com.sg.service.Interest;

public class InterestClient {

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle");
		double amt = scan.nextDouble();
		System.out.println("Enter the Years");
		int years = scan.nextInt();
		System.out.println("Enter the Rate");
		float rate = scan.nextFloat();
		try{
			
			Interest obj = new Interest(amt,years,rate);
			
			System.out.println("Simple interest = "+ obj.calcSimple());
			System.out.println("Compound interest = "+ obj.calcCompound());
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
		scan.close();

	}

}
