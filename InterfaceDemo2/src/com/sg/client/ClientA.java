package com.sg.client;

import java.util.List;

import com.sg.service.DaoFactory;
import com.sg.service.Idao;
import com.sg.vo.Emp;

public class ClientA {

	public static void main(String[] args) {
		Idao dao = DaoFactory.getDao();
		List<Emp> lst = dao.getEmployee();
		for(Emp e: lst){
			System.out.println(e);
		}

	}

}
