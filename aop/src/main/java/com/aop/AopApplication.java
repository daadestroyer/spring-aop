package com.aop;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
		PaymentService paymentObject = context.getBean("payment",PaymentService.class);
		
		paymentObject.makePayment(123000);
	}

}
