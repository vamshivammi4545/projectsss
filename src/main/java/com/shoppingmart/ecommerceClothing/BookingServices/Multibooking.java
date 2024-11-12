package com.shoppingmart.ecommerceClothing.BookingServices;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Multibooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int prodid;
    private int qut;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getProdid() {
        return prodid;
    }
    public void setProdid(int prodid) {
        this.prodid = prodid;
    }
    public int getQut() {
        return qut;
    }
    public void setQut(int qut) {
        this.qut = qut;
    }
    

    
}
