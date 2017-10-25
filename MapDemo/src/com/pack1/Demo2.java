package com.pack1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1007, "ram");
		map.put(1001, "sam");
		map.put(1004, "Bam");
		map.put(1003, "Fam");
		map.put(1005, "Mam");
		map.put(1007, "Rahul");
		
		//Iterating using keyset
		Set<Integer> kset = map.keySet();
		for(int eid : kset){
			System.out.println(eid+" "+map.get(eid));
		}
		System.out.println("-----------------------------------------------------------");
		Collection<String> col = map.values();
		for(String str: col){
			System.out.println(str);
		}
		System.out.println("-----------------------------------------------------------");
		Set<Entry<Integer,String>> eset = map.entrySet();
		for(Entry e:eset){
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
	}

}
