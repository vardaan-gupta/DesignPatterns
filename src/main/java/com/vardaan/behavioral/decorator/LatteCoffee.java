package com.vardaan.behavioral.decorator;

public class LatteCoffee extends CoffeeDecorator {

	public LatteCoffee(Coffee coffeeToBeDecorated) {
		super(coffeeToBeDecorated);
		
	}
	
	
	
	@Override
	public int price() {
		return ( super.price() + 50 );
	}

	@Override
	public void getCoffeeInfo() {
		super.getCoffeeInfo() ;
		System.out.println( "Plus More Milk Plus Coffee");		
	}

}
