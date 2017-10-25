package com.sg.client;

import com.sg.service.Mtable;

public class MtableClient {

	public static void main(String[] args) {
		try {
			Mtable obj = new Mtable(5);
			obj.display(4,7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
