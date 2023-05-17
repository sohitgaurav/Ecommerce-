package com.geekster.EcommerseWeeklytest7may.controller;

import com.geekster.EcommerseWeeklytest7may.models.Order;
import com.geekster.EcommerseWeeklytest7may.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping()
    ResponseEntity<String> placeOrder(@RequestBody Order myOrder) {

        String response;
        HttpStatus status;
        try {
            orderService.createOrder(myOrder);
            response="your order of "+myOrder.getProductCountNumber()+" was placed successfully ";
            status=HttpStatus.CREATED;

        } catch (Exception e) {
            response ="detail pass with your order are invalid!!!";
            status=HttpStatus.BAD_REQUEST;
            System.out.println(e);
        }
       return new ResponseEntity<String >(response,status);

    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable Long orderId){
        return orderService.fetchOrder(orderId);
    }
}
