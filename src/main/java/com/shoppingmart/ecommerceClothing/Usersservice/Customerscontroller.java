package com.shoppingmart.ecommerceClothing.Usersservice;

import java.security.NoSuchAlgorithmException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class Customerscontroller {

    @Autowired
    private Customersservice customersservice;

    @PostMapping("/save")
    public Customers register(@RequestBody Customers customers) throws NoSuchAlgorithmException
    {
        return customersservice.register(customers);
    }

    @GetMapping("/getbyid/{i}")
    public Optional<Customers> getbyid(@PathVariable int i)
    {
        return customersservice.getbyid(i);
    }
}
