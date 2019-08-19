package com.vardaan.behavioral.strategy;

/**
 * Strategy pattern in quite <b>useful for implementing set of related algorithms</b>
 * e.g. compression algorithms, filtering strategies etc. 
 *<p>
 * Strategy design pattern allows you to create Context classes, 
 * which uses Strategy implementation classes for applying business rules. 
 * This pattern follows open closed design principle and quite useful in Java.
 * <p>
 * One of a good example of Strategy pattern from JDK itself is a 
 * Collections.sort() method and Comparator interface, 
 * which is a strategy interface and defines a strategy for comparing objects. 
 * 
 * Because of this pattern, we don't need to modify sort() method (closed for modification) 
 * to compare any object, at the same time we can implement Comparator interface to 
 * define new comparing strategy (open for extension).

 */
public class StrategyDemo {

	 public static void main(String[] arguments) {
	        // Prepare strategies
	        BillingStrategy normalStrategy    = BillingStrategy.normalStrategy();
	        BillingStrategy happyHourStrategy = BillingStrategy.happyHourStrategy();

	        Customer firstCustomer = new Customer(normalStrategy);

	        // Normal billing
	        firstCustomer.add(100, 1);

	        // Start Happy Hour
	        firstCustomer.setStrategy(happyHourStrategy);
	        firstCustomer.add(130, 2);
	        firstCustomer.add(200, 1);
	        // New Customer
	        Customer secondCustomer = new Customer(happyHourStrategy);
	        secondCustomer.add(100, 1);
	        // The Customer pays
	        firstCustomer.printBill();

	        // End Happy Hour
	        secondCustomer.setStrategy(normalStrategy);
	        secondCustomer.add(130, 2);
	        secondCustomer.add(200, 1);
	        secondCustomer.printBill();
	    }
}
