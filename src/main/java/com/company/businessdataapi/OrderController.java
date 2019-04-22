package com.company.businessdataapi;

import com.company.businessdataapi.model.Order;
import com.company.businessdataapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @CrossOrigin
    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.getAllorders();
    }

    @CrossOrigin
    @GetMapping("/deleteOrder/{orderId}")
    public int delete(@PathVariable Long orderId) { return orderService.deleteOrder(orderId); }

}
