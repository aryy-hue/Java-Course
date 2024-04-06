package com.manager;

public class ManagerApp {
	public static void main(String[] args) {
		var manager = new Manager();
		manager.name = "Arya";
		manager.sayHello("Rudi");
		
		var vp = new VicePresident();
		vp.name = "Jennifer";
		vp.sayHello("Yanto");
	}
}
