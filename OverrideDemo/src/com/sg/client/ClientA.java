package com.sg.client;

import com.sg.service.Emp;

public class ClientA {

	public static void main(String[] args) {
		Emp e1 = new Emp(1001, "ram");
		Emp e2 = new Emp(1002,"tom");
		Emp e3 = new Emp(1001, "ram");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
