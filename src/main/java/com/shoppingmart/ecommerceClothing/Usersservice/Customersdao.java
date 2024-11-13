package com.shoppingmart.ecommerceClothing.Usersservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Customersdao {

    @Autowired
    private Customersrepo customersrepo;

    
    public Customers register(Customers customers)
    {
        return customersrepo.save(customers);
    }

    public Optional<Customers> getbyid(int i)
    {
        return customersrepo.findById(i);
    }
}
