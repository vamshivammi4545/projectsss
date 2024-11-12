package com.shoppingmart.ecommerceClothing.BookingServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // @PostMapping("/saveBooking")
    // public BookingDto saveBooking(@RequestBody BookingDto bookingDto)
    // {
    //     return bookingService.saveBooking(bookingDto);
    // }

    @GetMapping("/getbookingg/{i}")
    public Optional<BookingDto> getBooking(@PathVariable int i)
    {
        return bookingService.getbooking(i);
    }

    @PostMapping("/getmultibooking")
    public List<BookingDto> getmultiplebooking(@RequestBody List<Integer> i)
    {
        return bookingService.getmultiplebooking(i);
    }

    @PostMapping("/savemultibooking")
    public String savemultibooking(@RequestBody BookingDto bookingDto)
    {
        return bookingService.savemultibooking(bookingDto);
    }

    @PostMapping("/discount")
    public String discountcopun10(@RequestBody BookingDto bookingDto)
    {
        return bookingService.discountcopun10(bookingDto);
    }
}
