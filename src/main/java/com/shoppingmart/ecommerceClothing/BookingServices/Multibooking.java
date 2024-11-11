package com.shoppingmart.ecommerceClothing.BookingServices;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Multibooking {

    @Id
    private int id;
    private int qut;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQut() {
        return qut;
    }
    public void setQut(int qut) {
        this.qut = qut;
    }

    
}
