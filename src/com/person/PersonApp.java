package com.person;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var person1 = new Person("Jennifer", "Surabaya");
		//	CONSTRUCTOR OVERLOADING	
		// 	var person2 = new Person("Jennifer");
		// 	var person3 = new Person();
		
		System.out.println(person1.name);
		System.out.println(person1.address);
		person1.sayHello("Arya");
	}

}
