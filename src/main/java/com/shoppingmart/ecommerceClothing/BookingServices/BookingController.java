package com.shoppingmart.ecommerceClothing.BookingServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/saveBooking")
    public BookingDto saveBooking(@RequestBody BookingDto bookingDto)
    {
        return bookingService.saveBooking(bookingDto);
    }
}
