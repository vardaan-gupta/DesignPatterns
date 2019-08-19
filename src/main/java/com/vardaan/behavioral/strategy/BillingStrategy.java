package com.vardaan.behavioral.strategy;

@FunctionalInterface
public interface BillingStrategy {

	Integer getActPrice(int i);
	
	

	
	//Java8 onwards
	static BillingStrategy normalStrategy() {
		return rawPrice -> rawPrice ;
	}
	
	// 50% strategy
	static BillingStrategy happyHourStrategy() {
		return rawPrice -> rawPrice/2 ;
	}

}
