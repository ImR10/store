package com.rizwan.store;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// StoreApplication class runs the application
@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);

		// var orderService = new OrderService(new PayPalPaymentService());
		orderService.placeOrder();



	}

}
