package com.example.thymeleafdemoemployeelist.controller;

import com.example.thymeleafdemoemployeelist.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
List<Customer> list=null;
 @PostConstruct
    public void loadData()
    {
        list=new ArrayList<Customer>();
        list.add(new Customer(1,"John Doe","Hyderabad"));
        list.add(new Customer(2,"Mary Public","Chennai"));
        list.add(new Customer(3,"Sachin Tendulkar","Mumbai"));
        list.add(new Customer(4,"Jhonty Roads","Kolkata"));
    }

    @GetMapping("/list")
    public String list(Model theModel)
    {
        theModel.addAttribute("customers",list);
        return "customer-list";
    }
}
