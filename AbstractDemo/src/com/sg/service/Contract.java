package com.sg.service;

public class Contract extends Emp{

	private int days;

	public Contract(int eid, String ename, double sal, int days) {
		super(eid, ename, sal);
		this.days = days;
	}

	@Override
	public double calcSalary() {
		
		return getSal()* days;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%55d%15.2f\n",days,calcSalary());
	}
	
}