package com.sg.service;

import java.util.ArrayList;
import java.util.List;

import com.sg.vo.Emp;

public class EmpMemDao implements Idao{
   protected EmpMemDao(){
	   
   }
   
	@Override
	public List<Emp> getEmployee() {
		System.out.println("from inline memory");
		List <Emp> lst = new ArrayList<>();
		lst.add(new Emp(1001,"ram",9000));
		lst.add(new Emp(1002,"harry",7000));
		lst.add(new Emp(1003,"barry",11000));
		return lst;
	}

}