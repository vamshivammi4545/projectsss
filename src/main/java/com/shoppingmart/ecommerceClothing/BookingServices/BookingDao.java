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
    public String savemultibooking(BookingDto bookingDto)
    {
        List<Multibooking> mb=(List<Multibooking>) bookingDto.getMultibooking();
        for (Multibooking multibooking : mb) {
            int idd=multibooking.getId();
            int qtyy=multibooking.getQut();
            Optional<Productsdto> oo= productRepo.findById(idd);
            int price=oo.get().getPrice();
            int totalprice=oo.get().getPrice()*qtyy;
            bookingDto.setProductId(idd);
            bookingDto.setPrice(price);
            bookingDto.setTotalPrice(totalprice);
            bookingDto.setQuantity(qtyy);
            bookingDto.setBookingdateTime(LocalDateTime.now());
            bookingRepo.save(bookingDto);
        }
        return "Success";
    }
}
