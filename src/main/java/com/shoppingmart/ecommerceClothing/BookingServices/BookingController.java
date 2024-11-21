package com.shoppingmart.ecommerceClothing.BookingServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingmart.ecommerceClothing.productsService.Productsdto;

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


    @GetMapping("/byrange/{minrange}/{maxrange}")
    public List<Productsdto> getbypricerange(@PathVariable int minrange, @PathVariable int maxrange)
    {
        return bookingService.getbyrange(minrange, maxrange);
    }
    // @GetMapping("/byrange")
    // public List<Productsdto> getbypricerange(@RequestParam int minrange, @RequestParam int maxrange)
    // {
    //     return bookingService.getbyrange(minrange, maxrange);
    // }
}
