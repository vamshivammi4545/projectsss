package com.shoppingmart.ecommerceClothing.productsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
     @Autowired
    private ProductsDao productsDao;

public String  saveProductsService(Productsdto productsdto){
    return productsDao.saveProductsDAO(productsdto);
} 
}
