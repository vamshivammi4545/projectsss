package com.shoppingmart.ecommerceClothing.Usersservice;



import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

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

    public Optional<Customers> getbyid(int i)
    {
        return customersdao.getbyid(i);
    }

    public List<Customers> getallcustomers()
    {
        return customersdao.getallcustomers();
    }
}
