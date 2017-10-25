package com.sg.client;

import com.sg.service.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		NokiaLumia obj = new NokiaLumia();
		obj.sendSms();
		obj.browseNet();
		obj.doConverse();

	}

}
