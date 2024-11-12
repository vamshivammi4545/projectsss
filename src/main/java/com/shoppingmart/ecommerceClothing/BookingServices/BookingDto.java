package com.shoppingmart.ecommerceClothing.BookingServices;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class BookingDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // private int productId;
    private int userId;
    // private int price;
    private String paymentType;
    private String status;
    // private int quantity;
    private int totalPrice;
    private LocalDateTime bookingdateTime;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Multibooking> multibooking;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public LocalDateTime getBookingdateTime() {
        return bookingdateTime;
    }
    public void setBookingdateTime(LocalDateTime bookingdateTime) {
        this.bookingdateTime = bookingdateTime;
    }
    public List<Multibooking> getMultibooking() {
        return multibooking;
    }
    public void setMultibooking(List<Multibooking> multibooking) {
        this.multibooking = multibooking;
    }
    

    
  
    

    
}
