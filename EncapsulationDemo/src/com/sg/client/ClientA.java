package com.sg.client;

import com.sg.service.Emp;

public class ClientA {

	public static void main(String[] args) {
		Emp emp = new Emp();
  try{
	  emp.setName("Devil");
	  emp.setAge(23);
	  System.out.println(emp.getName()+" "+emp.getAge());
	  
  }
	
  catch(Exception e){
	  System.out.println(e.getMessage());
  }
	}
}
