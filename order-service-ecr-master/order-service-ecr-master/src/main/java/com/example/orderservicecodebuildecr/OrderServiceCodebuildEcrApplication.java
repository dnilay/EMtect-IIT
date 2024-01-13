package com.example.orderservicecodebuildecr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController

public class OrderServiceCodebuildEcrApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceCodebuildEcrApplication.class, args);
    }
    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public ResponseEntity<?> getStatus() throws UnknownHostException {
        return ResponseEntity.status(HttpStatus.OK).body(InetAddress.getLocalHost().toString());
    }

    @GetMapping("/orders")
    public List<Order> fetchOrders() {
        return orderDao.getOrders().stream().
                sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
    }


}
