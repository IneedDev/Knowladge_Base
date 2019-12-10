package com.romaniuk.controller;

import com.romaniuk.entity.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{userid}")
    public String displayUser(@PathVariable String userid){
        return "User found: " + userid;
    }
    @RequestMapping("{userid}/invoices")
    public String displayUserInvoices(@PathVariable String userid, @RequestParam(value = "date", required = false) Date date) {

        return "Invoice found for user id: " + userid + "on the date " + date;
    }

    @RequestMapping("/{userid}/items")
    public List<String> displayStringJson(){

        return asList("1", "2", "3");
    }

    @RequestMapping("/{userid}/items_as_json")
    public List<Product> displayProductsJson(){

        return asList(new Product(1,"Shoes", 2.09),new Product(2,"Shoes", 2.09),new Product(3,"Shoes", 2.09));
    }
}
