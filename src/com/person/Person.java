package com.person;

public class Person {
	String name;
	String address;
	final String country = "Indonesia";
	
	Person(String paramName , String paramAddress ){
		name = paramName;
		address = paramAddress;
	}
	Person(String paramName){
		this(paramName, null);
	}
	Person(){
		this(null);
	}
	
	//	METHOD
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + ", My name is " + this.name);
	}
}
