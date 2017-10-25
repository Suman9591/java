package com.pack2;

public class Product {
	
	private int pid;
	private String pname;
	private double price;
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return pid+" "+pname+" "+price;
	}
	@Override
	public boolean equals(Object obj) {
		Product prod = (Product)obj;
		if(this.pid == prod.pid)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		
		return pid;
	};

}
