package com.example.hello.udanthika.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customerdetail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String address;
    private String dob;
    private String wishlist;
    
    @JsonIgnore
    @OneToOne(mappedBy = "customerDetails")
    private Customer customer;

    public Customerdetail() {
    }
    public Customerdetail(long id, String address, String dob, String wishlist,Customer customer) {
        this.id = id;
        this.address = address;
        this.dob = dob;
        this.wishlist = wishlist;
        this.customer=customer;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getWishlist() {
        return wishlist;
    }
    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    

}
