package com.shoppingmart.ecommerceClothing.BookingServices;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingDao bookingDao;

    public BookingDto saveBooking(BookingDto bookingDto)
    {
        bookingDto.setBookingdateTime(LocalDateTime.now());
        return bookingDao.saveBooking(bookingDto);
        
    }
}
