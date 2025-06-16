package com.codekshitij.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    //here the order service class is now not dependent on a single paymenyt service
    // as per the obj provided it will work

    // if we dont use ths @autowired annotaion it will give us error
    // creating bean orderservice
   // public OrderService(PaymentService paymentService,int x){}

    // @Autowired   //when we have multiple constructors
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
       paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
