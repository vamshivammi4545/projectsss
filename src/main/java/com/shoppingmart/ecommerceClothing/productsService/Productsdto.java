package com.shoppingmart.ecommerceClothing.productsService;

import com.shoppingmart.ecommerceClothing.BookingServices.BookingDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Productsdto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Productname;
    private int price;
    private int quantity;

    
    public Productsdto(int id, String productname, int price, int quantity) {
        this.id = id;
        Productname = productname;
        this.price = price;
        this.quantity = quantity;
    }
    public Productsdto() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProductname() {
        return Productname;
    }
    public void setProductname(String productname) {
        Productname = productname;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }    

    



}
