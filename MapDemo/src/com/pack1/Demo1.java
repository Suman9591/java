package com.pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1007, "ram");
		map.put(1001, "sam");
		map.put(1004, "Bam");
		map.put(1003, "Fam");
		map.put(1005, "Mam");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Eid");
		int eid = scan.nextInt();
		if(map.containsKey(eid))
			System.out.println(map.get(eid));
		else
			System.out.println("not found....");

	}

}
