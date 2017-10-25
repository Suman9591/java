package com.sg.client;

public class SquareClient {
	public static double calcArea(int side){
		System.out.println("int arg...");
		return side*side;
	}
	public static double calcArea(double side){
		System.out.println("Double arg...");
		return side*side;
	}

	public static void main(String[] args) {
		System.out.println("Result = "+ calcArea(5));

	}

}
