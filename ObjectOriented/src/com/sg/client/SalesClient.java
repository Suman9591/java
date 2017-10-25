package com.sg.client;

import com.sg.service.Sales;


public class SalesClient {

	public static void main(String[] args) {
		Sales s1 = new Sales("ram",12000);
		Sales s2 = new Sales("tom", 15000);
		Sales s3 = new Sales("sam",22000);
		
		System.out.println("Total Sales "+Sales.tamt);
		System.out.println("No of salesmen"+Sales.num);
		
	}

}
