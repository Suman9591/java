package com.pack1;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println(genNos());

	}
	
	public static Set<Integer> genNos(){
		Set<Integer> set = new  HashSet<Integer>();
		int no = 0;
		while(set.size()<5){
			no = (int)(Math.random()*15);
			if(no>0)
				set.add(no);
		}
		return set;
	}

}
