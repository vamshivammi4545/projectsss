package com.shoppingmart.ecommerceClothing.Notifications;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
@Entity
public class Notification {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

      @ElementCollection
    @CollectionTable(name = "notification_messages", joinColumns = @JoinColumn(name = "notification_id"))
    @Column(name = "message")
    private List<String>  Notifications;

    private LocalDateTime localDateTime;

    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<String> getNotifications() {
        return Notifications;
    }
    public void setNotifications(List<String> notifications) {
        Notifications = notifications;
    }
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
    
}
