package com.sg.service;

public class Mtable {
private int num;

public Mtable(int num) throws Exception {
	super();
	if(num  <= 0)
		throw new Exception("Number cannot be Zero");
	this.num = num;
}
public void display(){
	for(int i=1; i<=10; ++i)
		System.out.printf("%d * %d = %d\n",i,num,(num*i));
		
}
public void display(int rows){
	for(int i=1; i<=rows; ++i)
		System.out.printf("%d * %d = %d\n",i,num,(num*i));
		
}
public void display(int start, int end){
	for(int i=start; i<=end; ++i)
		System.out.printf("%d * %d = %d\n",i,num,(num*i));
		
}
}
