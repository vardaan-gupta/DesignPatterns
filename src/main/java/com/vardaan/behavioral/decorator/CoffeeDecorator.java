package com.vardaan.behavioral.decorator;

public abstract class CoffeeDecorator implements Coffee {

	
	private Coffee coffee;

	public CoffeeDecorator(Coffee coffeeToBeDecorated) {
		super();
		this.coffee = coffeeToBeDecorated;
	}
	
	public int price() {
		return coffee.price();
		
	}

	@Override
	public void getCoffeeInfo() {
		coffee.getCoffeeInfo();
		
	}
	
	
}
