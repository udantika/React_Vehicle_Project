package com.example.hello.udanthika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.udanthika.model.Customer;
import com.example.hello.udanthika.repository.CustomerRepo;
import com.example.hello.udanthika.service.CustomerService;


@RestController
@RequestMapping("api/v1/user")
public class CustomerController {

    @Autowired
    private CustomerService CustomerService;
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/save")
    public ResponseEntity<?> saveCustomer(@RequestBody Customer newCustomer) {
        try {
            CustomerService.saveCustomer(newCustomer);
            return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/update/{email}")
    public ResponseEntity<?> updateCustomer(@PathVariable String email, @RequestBody Customer Customer) {
        try {
            return CustomerService.updateCustomer(email, Customer);
        } catch (Exception e) {
            return new ResponseEntity<>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/Customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> Customers = CustomerService.getAllCustomers();
        return new ResponseEntity<>(Customers, HttpStatus.OK);
    }
   

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long Id) {
        try {
            // Call the service method to delete the user
            CustomerService.deleteCustomer(Id);
            return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to delete user", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PatchMapping("/update/{email}")
    public ResponseEntity<?> patchCustomer(@PathVariable String email, @RequestBody Customer Customer) {
        try {
            return CustomerService.patchCustomer(email, Customer);
        } catch (Exception e) {
            return new ResponseEntity<>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllUsers(
        @RequestParam(defaultValue = "0") Integer pageNo,
        @RequestParam(defaultValue = "2") Integer pageSize,
        @RequestParam(defaultValue = "id") String sortBy,
        @RequestParam(defaultValue = "asc") String sortOrder) {

        try {
            Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(Sort.Direction.fromString(sortOrder), sortBy));
            Page<Customer> customersPage = CustomerService.getAllUsers(pageable);
            List<Customer> customers = customersPage.getContent();

            if (customers.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
   
//Pagination


}


