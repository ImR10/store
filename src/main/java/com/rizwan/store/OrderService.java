package com.rizwan.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// OrderService class responsible for placing an order
@Component
public class OrderService {
    private PaymentService paymentService;

    public OrderService() {}

    // @Autowired tells spring to autowire an object with its dependencies
    // not needed if class only has one constructor
    @Autowired
    public OrderService (PaymentService paymentService) {
        this.paymentService = paymentService;;
    }

    public void placeOrder() {
        paymentService.processPayment(100);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
