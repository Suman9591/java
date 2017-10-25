package com.sg.demos;

public class MyUtil {
	
	public static double clacSimple(double p, int n, float r){
		double si = p*n*r /100;
		return round2Dec(si);
	}
	public static double clacCompound(double p, int n, float r){
		double ci = p*Math.pow((1+r/100),n) -p;
		return round2Dec(ci);
	}
	public static double round2Dec(double val){
		val = Math.round(val*100)/100.0;
		return val;
	}
	public static double calcArea(double radius){
		double area = Math.PI * radius* radius;
		return area;
	}
	public static double calcPeri(double radius){
		double per = 2*Math.PI * radius;
		return per;
	}

}
