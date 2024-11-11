package com.shoppingmart.ecommerceClothing.BookingServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDao {

    @Autowired
    private BookingRepo bookingRepo;

    public BookingDto saveBooking(BookingDto bookingDto)
    {
        return bookingRepo.save(bookingDto);
    }

}
