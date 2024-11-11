package com.shoppingmart.ecommerceClothing.BookingServices;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingmart.ecommerceClothing.productsService.ProductRepo;
import com.shoppingmart.ecommerceClothing.productsService.Productsdto;

@Service
public class BookingService {

    @Autowired
    private BookingDao bookingDao;

    @Autowired
    private ProductRepo productRepo;

    public BookingDto saveBooking(BookingDto bookingDto)
    {
        // Optional<Productsdto> productsdto=productRepo.findById(bookingDto.getId());
        // bookingDto.setPrice(productsdto.get().getPrice());
        // bookingDto.setTotalPrice(bookingDto.getQuantity()*productsdto.get().getPrice());
        // bookingDto.setBookingdateTime(LocalDateTime.now());
        Optional<Productsdto> o=productRepo.findById(bookingDto.getProductId());
        bookingDto.setPrice(o.get().getPrice());
        int totalprice=bookingDto.getQuantity()*o.get().getPrice();
        bookingDto.setTotalPrice(totalprice);
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
