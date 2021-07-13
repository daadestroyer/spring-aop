package com.aop.services;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void makePayment() {
		 
		// payment code
		
		System.out.println("Payment Debited...");
		
		System.out.println("Amount Credited...");
	}

}
