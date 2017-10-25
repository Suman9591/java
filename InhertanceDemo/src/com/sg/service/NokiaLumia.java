package com.sg.service;

public class NokiaLumia extends Nokia1100{
	public void browseNet(){
		/*doConverse();
		sendSms();*/
		System.out.println("browse net");
	}

	@Override
	public void doConverse() {
		System.out.println("4g -- do converse");
	}
}
