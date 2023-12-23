package com.aboutfinal;

public class Bank {

	public final float interestRate = 5;
	
	public Bank() {
		consumerInterest();
	}
	
	public void repoRate() {
		System.out.println("repo rate");
	}
	
	public void consumerInterest() {
		System.out.println("consumer Interest of bank");
	}
	
}
