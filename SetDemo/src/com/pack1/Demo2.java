package com.pack1;

import java.util.HashSet;
import java.util.Set;



public class Demo2 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1001,"rew",3000);
		Emp e2 = new Emp(1002,"tew",4000);
		Emp e3 = new Emp(1003,"gew",5000);
		Emp e4 = new Emp(1004,"pew",6000);
		Emp e5 = new Emp(1005,"mew",7000);
		Emp e6 = new Emp(1001,"rew",3000);
		
		Set<Emp> set = new HashSet<>(100, 0.75f);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e4);
		
		for(Emp emp: set){
			System.out.println(emp);
		}

	}

}
