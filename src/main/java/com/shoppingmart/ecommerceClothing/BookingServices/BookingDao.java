package com.shoppingmart.ecommerceClothing.BookingServices;



import java.util.List;
import java.util.Optional;

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

    public Optional<BookingDto> getBooking(int i)
    {
        return bookingRepo.findById(i);
    }
    public List<BookingDto> getmultiplebooking(Iterable<Integer> i)
    {
        return bookingRepo.findAllById(i);
    }
}
