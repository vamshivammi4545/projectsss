package com.shoppingmart.ecommerceClothing.productsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductsController {
    @Autowired
    private ProductService productService;

    @PostMapping("/saveproduct")
    public String  saveProductsController(@RequestBody Productsdto productsdto){
    return productService.saveProductsService(productsdto);
} 

}
