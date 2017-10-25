package com.sg.service;

public class Emp {
private String name;
private byte age;

public String getName() {
	return name;
}
public void setName(String name) throws Exception {
	if(!name.matches("[A-Za-z]{3,15}")){
		throw new Exception("Name must be alphabet contains 3 to 16 characters");
	}
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) throws Exception {
	if(age < 20 || age>60){
		throw new Exception("Age must be between 20 and 60 ");
	}
	this.age = (byte)age;
}
}
