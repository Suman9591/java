package com.sg.vo;

public class Emp {
	private int eid;
	private String ename;
	private double sal;
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		
		return eid+" "+ename+" "+sal;
	}
	

}
