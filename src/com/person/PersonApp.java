package com.person;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var person1 = new Person();
		person1.name = "Arya";
		person1.address = "Bandung";
		
		System.out.println(person1.name);
		System.out.println(person1.address);
		person1.sayHello("Jabas");
	}

}
