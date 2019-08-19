package com.vardaan.behavioral.decorator;

public class SimpleCoffee implements Coffee {

	@Override
	public void getCoffeeInfo() {
		System.out.println("simple coffee");

	}

	@Override
	public int price() {
		return 50;
	}

}
