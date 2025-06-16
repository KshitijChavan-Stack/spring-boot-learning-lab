package com.codekshitij.store;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        //With this we have implemented OPEN CLOSED PRINCIPLE
        // a class should be open for extension but close to modificaion
        //var orderService = new OrderService(new PayPalPaymentService());
        // this thing here is a required dependency without it the program crashes
        ConfigurableApplicationContext context = (ConfigurableApplicationContext) SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
