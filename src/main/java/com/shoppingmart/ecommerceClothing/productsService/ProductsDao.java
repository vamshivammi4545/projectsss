package com.shoppingmart.ecommerceClothing.productsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsDao {
 @Autowired
private ProductRepo productsrepo;

    public String saveProductsDAO(Productsdto productsdto){
        Productsdto pr=productsrepo.save(productsdto);
        if (pr != null) {
            return "product saved";
        }else{
        return "product not saved";
        }
    }
    

}
