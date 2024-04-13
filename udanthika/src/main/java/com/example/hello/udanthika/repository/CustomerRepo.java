package com.example.hello.udanthika.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.hello.udanthika.model.Customer;



public interface CustomerRepo extends JpaRepository<Customer, Long >{
    Optional<Customer> findByEmail(String email);
    void deleteById(int Id);
  
}