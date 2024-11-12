package com.shoppingmart.ecommerceClothing.BookingServices;



import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoppingmart.ecommerceClothing.productsService.ProductRepo;
import com.shoppingmart.ecommerceClothing.productsService.Productsdto;

@Repository
public class BookingDao {

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private ProductRepo productRepo;


    // public BookingDto saveBooking(BookingDto bookingDto)
    // {
    //     return bookingRepo.save(bookingDto);
    // }

    public Optional<BookingDto> getBooking(int i)
    {
        return bookingRepo.findById(i);
    }
    public List<BookingDto> getmultiplebooking(Iterable<Integer> i)
    {
        return bookingRepo.findAllById(i);
    }
    public String savemultibooking(BookingDto bookingDto)
    {
        int totalprice=0;
      List<Multibooking> multibookings=  bookingDto.getMultibooking();
      for (Multibooking multibooking : multibookings) {
      Optional<Productsdto> productsdto=  productRepo.findById( multibooking.getProdid());
     int prodprice= productsdto.get().getPrice();
            totalprice+= prodprice*multibooking.getQut();
      }
      bookingDto.setTotalPrice(totalprice);
      bookingDto.setBookingdateTime(LocalDateTime.now());
      bookingRepo.save(bookingDto);
      return "done";
    }
}
