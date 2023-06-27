package com.example.Customer.service;

import com.example.Customer.entity.Customer;
import com.example.Customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    //add customer
   public ResponseEntity<Customer> addCustomer(Customer customer)
   {
       return ResponseEntity.ok(customerRepository.save(customer));
   }

   //get customers
    public ResponseEntity<List<Customer>> getAllCustomers()
    {
        return ResponseEntity.ok(customerRepository.findAll());
    }

    //delete customer by id
    public ResponseEntity<String> deleteCustomerById(int id)
    {
        customerRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted");
    }

    //update customer by id
    public ResponseEntity<Customer> updateCustomerById(Customer customer,int id)
    {
        Customer customer1=customerRepository.findById(id).get();
        customer1.setFirstname(customer.getFirstname());
        customer1.setLastname(customer.getLastname());
        customer1.setAge(customer.getAge());
        customer1.setDob(customer.getDob());
        customer1.setPhoneno(customer.getPhoneno());
        customer1.setDistrict(customer.getDistrict());
        customer1.setState(customer.getState());
        return ResponseEntity.ok(customerRepository.save(customer1));
    }

    //get customer by id

    public ResponseEntity<Customer> getCustomerById(int id)
    {
        Customer customer=customerRepository.findById(id).get();
        return ResponseEntity.ok(customer);
    }

}
