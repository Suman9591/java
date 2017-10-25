package com.sg.client;

import com.sg.service.Agent;
import com.sg.service.Atm;
import com.sg.service.Bank;

public class ClientA {

	public static void main(String[] args) {
		Atm atm = Bank.getAtm();
		atm.deposit();
		atm.getBalance();
		atm.withdraw();
		
		Agent agent = Bank.getAgent();
		agent.clearPdc();
		agent.genStatement();

	}

}
