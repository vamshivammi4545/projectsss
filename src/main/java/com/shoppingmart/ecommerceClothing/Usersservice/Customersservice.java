package com.shoppingmart.ecommerceClothing.Usersservice;



import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Customersservice {

    @Autowired
    private Customersdao customersdao;

    public Customers register(Customers customers) throws NoSuchAlgorithmException
    {
        String pass=Changer.convert(customers.getPassword());
        customers.setPassword(pass);
        return customersdao.register(customers);
    }
}
