package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<>();
		lst.add("Tom");
		lst.add("Dik");
		lst.add("Harry");
		lst.add("Sunny");
		lst.add("Maddy");
		
		Collections.sort(lst);
		Iterator<String> it = lst.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*for(String str: lst){
			System.out.println(str);
		}*/


	}

}
