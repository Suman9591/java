package com.sg.service;

import com.sg.util.MyUtil;

public class Circle {
	private double radius;
	private double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius) throws Exception{
		if(radius <= 0)
			throw new Exception("Radius must be greater than zero");
		this.radius = radius;
	}
	public double calcArea(){
		return MyUtil.round2Dec(Math.PI * radius*radius);
	}
	public double calcPeri(){
		return MyUtil.round2Dec(2*Math.PI * radius);
	}

}
