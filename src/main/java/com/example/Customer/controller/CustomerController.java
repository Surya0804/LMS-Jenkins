package com.example.Customer.controller;

import com.example.Customer.entity.Customer;
import com.example.Customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Lis

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //add customer
    @PostMapping("/addcustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }

    //get customers
    @GetMapping("/getallcustomers")
    public ResponseEntity<List<Customer>> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    //delete customer by id
    @DeleteMapping("/deletecustomerbyid/{id}")
    public ResponseEntity<String> deleteCustomerById(@PathVariable int id)
    {
        return customerService.deleteCustomerById(id);
    }

    //update customer by id
    @PutMapping("/updatecustomerbyid/{id}")
    public ResponseEntity<Customer> updateCustomerById(@RequestBody Customer customer,@PathVariable int id)
    {
        return customerService.updateCustomerById(customer,id);
    }

    //get customer by id
    @GetMapping("/getcustomerbyid/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id)
    {
        return customerService.getCustomerById(id);
    }
}
