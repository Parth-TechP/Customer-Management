package com.example.customerManagenment.customerManagenment.controller;


import com.example.customerManagenment.customerManagenment.exception.ResourceNotFoundException;
import com.example.customerManagenment.customerManagenment.repository.customerRepository;
import com.example.customerManagenment.customerManagenment.model.customer;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/customer")
public class customerController {
    @Autowired
    customerRepository customerRepository;

    //Get ALl Customers
    @GetMapping
    public List<customer> getAllCustomer(){
//        if(customerRepository!= null)
            return this.customerRepository.findAll();
    }

    //Get Customer by id
    @GetMapping("/{id}")
    public ResponseEntity<customer> getCustomerById(@PathVariable(value = "id")UUID custId) throws ResourceNotFoundException{
        customer customer=customerRepository.findById(custId).orElseThrow(()->new ResourceNotFoundException("Customer not found for this id: "+custId) );
        return ResponseEntity.ok().body(customer);
    }

    //Create Customer
    @PostMapping()
    public customer createCustomer(@RequestBody customer customer){
        return this.customerRepository.save(customer);
    }

    //Update Customer
    @PutMapping("/{id}")
    public  ResponseEntity<customer> updateCustomer(@PathVariable(value = "id")UUID custId, @Validated @RequestBody customer customerDetails) throws ResourceNotFoundException{
        customer customer=customerRepository.findById(custId).orElseThrow(()->new ResourceNotFoundException("Customer not found for this id: "+custId));
        customer.setFirstName(customerDetails.getFirstName());
        customer.setLastName(customerDetails.getLastName());
        customer.setGender(customerDetails.getGender());
        customer.setAge(customerDetails.getAge());
        customer.setPhoneNumber(customerDetails.getPhoneNumber());
        return ResponseEntity.ok(this.customerRepository.save(customer));
    }

    //Delete Customer
    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteCustomer(@PathVariable(value = "id")UUID custId)throws  ResourceNotFoundException{
        customer customer=customerRepository.findById(custId).orElseThrow(()->new ResourceNotFoundException("Customer not found for this: "+custId));
        this.customerRepository.delete(customer);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return response;
    }
}
