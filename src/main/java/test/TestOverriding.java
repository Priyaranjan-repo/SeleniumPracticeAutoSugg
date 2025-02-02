package com.qa.test;

public class TestOverriding {
	

	public static void main(String[] args) {
	        Animal myDog = new Dog();
	        Animal myCat = new Cat();
	        myDog.makeSound();  // Calls the overridden method in Dog
	        myCat.makeSound();  // 

}

}