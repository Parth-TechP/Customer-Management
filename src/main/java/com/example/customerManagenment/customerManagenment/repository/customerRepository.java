package com.example.customerManagenment.customerManagenment.repository;


import com.example.customerManagenment.customerManagenment.model.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface customerRepository extends JpaRepository<customer, UUID> {

}
