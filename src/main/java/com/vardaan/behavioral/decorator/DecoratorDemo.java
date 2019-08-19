package com.vardaan.behavioral.decorator;
/**
 * In object-oriented programming, 
 * the decorator pattern is a design pattern that allows 
 * <b> behavior to be added to an individual object, dynamically, 
 * without affecting the behavior of other objects from the same class </b>.
 * <p>
 * 
 * [1] The decorator pattern is often useful for adhering to the Single Responsibility Principle,
 * as it allows functionality to be divided between classes with unique areas of concern
 * 
 *
 */
public class DecoratorDemo {
	
	//1. Component Interface – The interface or abstract
	//class defining the methods that will be implemented
	
	//2. Component Implementation – The basic implementation of the component interface. 
	//3. Decorator – Decorator class implements the component interface and
	   //it has a HAS-A relationship with the component interface. 
	   //The component variable should be accessible to the child decorator classes, 
	//so we will make this variable protected.

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		coffee.getCoffeeInfo();
		System.out.println(coffee.price());
		
		
	    coffee = new LatteCoffee(coffee);
	    coffee.getCoffeeInfo();
	    System.out.println(coffee.price());
	    
	    coffee = new CappicunoCoffee(coffee);
	    coffee.getCoffeeInfo();
	    System.out.println(coffee.price());
		
		
	}

}
