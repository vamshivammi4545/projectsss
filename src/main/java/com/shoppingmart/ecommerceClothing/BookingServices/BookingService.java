package com.shoppingmart.ecommerceClothing.BookingServices;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    public Optional<BookingDto> getbooking(int i)
    {
        return bookingDao.getBooking(i);
    }

    public List<BookingDto> getmultiplebooking(List<Integer> i)
    {
        return bookingDao.getmultiplebooking(i);
    }
}
