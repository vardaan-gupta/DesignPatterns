package com.vardaan.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private final List<Integer> drinks = new ArrayList<Integer>(0);
	private BillingStrategy strategy;
	
	
	public Customer(BillingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void add(int price, int quantity) {
		 this.drinks.add(this.strategy.getActPrice(price*quantity));
	}
	
	// Payment of bill
    public void printBill() {
        int sum = this.drinks.stream().mapToInt(v -> v).sum();
        System.out.println("Total due: " + sum );
        this.drinks.clear();
    }

    // Set Strategy
    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
	
}
