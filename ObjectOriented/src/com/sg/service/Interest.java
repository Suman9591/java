package com.sg.service;

import com.sg.util.MyUtil;

public class Interest {
	private double amount;
	private int years;
	private float rate;
	
	public Interest(double amount, int years, float rate) throws Exception {
		super();
		if(amount<=0 || years <=0 || rate <=0){
			throw new Exception("Data cannot be zero");
		}
		this.amount = amount;
		this.years = years;
		this.rate = rate;
	}

	public double calcSimple(){
		double si = amount * years* rate/100;
		return MyUtil.round2Dec(si);
	}
	
	public double calcCompound(){
		double ci = amount * Math.pow((1+rate/100), years)- amount;
		return MyUtil.round2Dec(ci);
	}

}
