package com.sg.service;

public class Bank implements Atm,Agent{
	
	
    private static Bank bank = new Bank();
    private Bank(){
    	
    }
    
    public static Atm getAtm(){
    	Atm atm = bank;
    	return atm;
    }
    
    public static Agent getAgent(){
    	Agent agent = bank;
    	return agent;
    }
    
	@Override
	public void genStatement() {
		System.out.println("Get Statement");
		
	}

	@Override
	public void clearPdc() {
		System.out.println("Clear PDC");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposite");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");
		
	}

	@Override
	public void getBalance() {
		System.out.println("Get Balance");
		
	}

}
