package com.shoppingmart.ecommerceClothing.productsService;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductsController {
    @Autowired
    private ProductService productService;

    @PostMapping("/Saveproduct")
    public String  saveProductsController(@RequestBody Productsdto productsdto){
    return productService.saveProductsService(productsdto);
}
 @GetMapping("/productId/{i}")
public Productsdto findProductById(@PathVariable int i) {
        return productService.findProductById(i);
    }
    @GetMapping("/findAllById")
    public List<Productsdto> findAllById(@RequestBody List<integer> i) {
        return productService.findAllById(i);
}
