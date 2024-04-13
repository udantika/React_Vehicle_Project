package com.example.hello.udanthika.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.hello.udanthika.model.Customer;
import com.example.hello.udanthika.repository.CustomerRepo;

@Service
public class CustomerService {

    @Autowired
    private final CustomerRepo CustomerRepo;

    public CustomerService(CustomerRepo CustomerRepo) {
        this.CustomerRepo = CustomerRepo;
    }

    public ResponseEntity<?> saveCustomer(Customer Customer) {
        Optional<Customer> CustomerExists = CustomerRepo.findByEmail(Customer.getEmail());
        if (!CustomerExists.isPresent()) {
            CustomerRepo.save(Customer);
            return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("User with email already exists", HttpStatus.CONFLICT);
        }
    }

    public ResponseEntity<?> updateCustomer(String email, Customer Customer) {
        Optional<Customer> CustomerExists = CustomerRepo.findByEmail(email);
        if (CustomerExists.isPresent()) {
            Customer existingCustomer = CustomerExists.get();
            existingCustomer.setUsername(Customer.getUsername());
            existingCustomer.setPassword(Customer.getPassword());
            // existingUser.setEmail(user.getEmail());
            // existingUser.setPhone(user.getPhone());
            CustomerRepo.save(existingCustomer);
            return new ResponseEntity<>(existingCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User with email " + email + " not found", HttpStatus.NOT_FOUND);
        }
    }
    public List<Customer> getAllCustomers() {
        return CustomerRepo.findAll();
    }

    public boolean deleteCustomer(Long id)
    {
        Optional<Customer>CustomerExists=CustomerRepo.findById(id);
        if(CustomerExists.isPresent())
        {
            CustomerRepo.deleteById(id);
        }
        return false;
    }
    public ResponseEntity<?> patchCustomer(String email, Customer Customer) {
        Optional<Customer> CustomerExists = CustomerRepo.findByEmail(email);
        if (CustomerExists.isPresent()) {
            Customer existingCustomer = CustomerExists.get();
            
            // Update only the fields that are not null in the request
            if (Customer.getUsername() != null) {
                existingCustomer.setUsername(Customer.getUsername());
            }
            if (Customer.getPassword() != null) {
                existingCustomer.setPassword(Customer.getPassword());
            }
            if (Customer.getEmail() != null) {
                existingCustomer.setEmail(Customer.getEmail());
            }
            if (Customer.getPhone() != null) {
                existingCustomer.setPhone(Customer.getPhone());
            }

            // Save the updated user
            CustomerRepo.save(existingCustomer);
            
            return new ResponseEntity<>(existingCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User with email " + email + " not found", HttpStatus.NOT_FOUND);
        }
    }
    public Page<Customer> getAllUsers(Pageable pageable) {
        return CustomerRepo.findAll(pageable);
    }
   

}