package com.sg.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.sg.vo.Emp;

public class EmpFileDao implements Idao{

	@Override
	public List<Emp> getEmployee() {
		System.out.println("fetch from file");
		FileReader fr = null;
		BufferedReader br = null;
		List<Emp> lst = new ArrayList<Emp>();
		Emp emp = null;
		String str = null;
		String[] arr = null;
		try{
			fr = new FileReader("emp.txt");
			br = new BufferedReader(fr);
			while((str= br.readLine()) != null){
				arr = str.split(",");
				emp = new Emp(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]));
				lst.add(emp);
				
			}
			br.close();
			fr.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return lst;
	}
}
