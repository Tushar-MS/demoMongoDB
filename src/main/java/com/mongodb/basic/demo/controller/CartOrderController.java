package com.mongodb.basic.demo.controller;

import com.mongodb.basic.demo.model.User;
import com.mongodb.basic.demo.repository.MongodbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartOrderController {

    @Autowired
    MongodbRepository mongodbRepository;

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestBody User user){
        mongodbRepository.save(user);
        return "Order Placed successfully..";
    }

    @GetMapping("/getUserByName/{name}")
    public List<User> getUserbyName(@PathVariable String name){
        return mongodbRepository.findByName(name);
    }

    @GetMapping("/getUserByAddress/{city}")
    public List<User> getUserByAddress(@PathVariable String city){
        return mongodbRepository.findByCity(city);
    }

}
