package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("Tom");
		lst.add("Dik");
		lst.add("Harry");
		lst.add("Sunny");
		lst.add("Maddy");
		
		Collections.sort(lst);
		for(String str: lst){
			System.out.println(str);
			
		}
		System.out.println("descending order----------------");
		Collections.sort(lst, Collections.reverseOrder());
		for(String str: lst){
			System.out.println(str);
			
		}
	}
}
