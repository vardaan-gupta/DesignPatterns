package com.vardaan.behavioral.strategy;

public class NormalStrategy implements BillingStrategy {

	public Integer getActPrice(int i) {
		return i;
	}

}
