package com.vardaan.behavioral.strategy;

public class HappyHourStrategy implements BillingStrategy {

	public Integer getActPrice(int i) {
		return i/2;
	}

}
