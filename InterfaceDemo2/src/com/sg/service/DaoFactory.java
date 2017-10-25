package com.sg.service;

import java.util.ResourceBundle;

public class DaoFactory {
     private static Idao dao;
     private static ResourceBundle rb;
     static{
    	 rb = ResourceBundle.getBundle("sg");
    	 
    	 try {
			Class cls = Class.forName(rb.getString("cname"));
			dao = (Idao) cls.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
     
     public static Idao getDao(){
    	 return dao;
     }
}
