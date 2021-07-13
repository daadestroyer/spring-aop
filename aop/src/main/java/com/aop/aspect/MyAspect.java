package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	// advice-1
	// give expression inside Before expression is nothing but PointCut
	// * represents any return type * com.aop.services.PaymentServiceImpl
	// * represents that you want to execute this method before every method which is present inside PaymentServiceImple class
	
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment(..) )")
	public void adviceBefore() {
		System.out.println("Payment Started...");
	}
	
	// advice-2
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment(..)  )")
	public void adviceAfter() {
		System.out.println("Payment Done ...");
	}
	
	
}