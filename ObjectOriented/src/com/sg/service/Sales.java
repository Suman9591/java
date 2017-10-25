package com.sg.service;

public class Sales {
private String name;
private double samt;
public static double tamt;
public static int num;
public Sales(String name, double samt) {
	super();
	this.name = name;
	this.samt = samt;
	tamt += this.samt;
	++num;
}


}
