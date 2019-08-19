package com.vardaan.behavioral.decorator;

public class CappicunoCoffee extends CoffeeDecorator {

	
	public CappicunoCoffee(Coffee coffeeToBeDecorated) {
		super(coffeeToBeDecorated);
	}
	
	@Override
	public int price() {
		return ( super.price() + 50 + 50 );
	}

	@Override
	public void getCoffeeInfo() {
		super.getCoffeeInfo() ;
		System.out.println( "Plus Milk Plus More Coffee");		
	}
}

