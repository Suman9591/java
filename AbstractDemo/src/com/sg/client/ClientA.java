package com.sg.client;

import com.sg.service.Contract;
import com.sg.service.Emp;
import com.sg.service.Onroll;

public class ClientA {

	public static void main(String[] args) {
		Emp[] arr = new Emp[4];
		arr[0] = new Onroll(1001,"ram",15000,2000);
		arr[1] = new Onroll(1002,"harry",25000,5000);
		arr[2] = new Contract(1003,"tom",5000,100);
		arr[3] = new Contract(1004,"rahi",3000,200);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%15s%15s%15s%15s%10s%15s\n","EID","ENAME","SAL","HRA","BONUS","PF","DAYS","NET");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		for(Emp emp: arr){
			emp.display();
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

	}

}
