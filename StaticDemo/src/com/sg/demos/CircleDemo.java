package com.sg.demos;

import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius");
		double rad = scan.nextDouble();
		double area = MyUtil.calcArea(rad);
		double perimeter = MyUtil.calcPeri(rad);
		System.out.println("Area of Circle  = "+ area);
		System.out.println("Perimeter of circle = "+ perimeter);

	}

}
