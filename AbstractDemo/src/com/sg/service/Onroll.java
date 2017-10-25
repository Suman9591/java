package com.sg.service;

public class Onroll extends Emp{
  
  private double bonus;
  private double pf;
  private double hra;
  public Onroll(int eid, String ename, double sal, double bonus) {
	super(eid, ename, sal);
	this.bonus = bonus;
	this.pf = getSal()* 0.12;
	this.hra = getSal()*0.20;
	
}
  
  
  
@Override
public void display() {
	
	super.display();
	System.out.printf("%15.2f%15.2f%15.2f%25.2f\n",hra,bonus,pf,calcSalary());
}



@Override
public double calcSalary() {
	
	return getSal()+bonus+hra -pf;
}


}
