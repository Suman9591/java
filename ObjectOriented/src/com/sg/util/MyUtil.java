package com.sg.util;

public class MyUtil {
	public static double round2Dec(double val){
		val = Math.round(val*100)/100.0;
		return val;
	}
}
