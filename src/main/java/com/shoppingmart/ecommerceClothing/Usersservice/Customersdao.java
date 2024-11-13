package com.shoppingmart.ecommerceClothing.Usersservice;

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
}
