package com.geekster.EcommerseWeeklytest7may.controller;

import com.geekster.EcommerseWeeklytest7may.models.Product;
import com.geekster.EcommerseWeeklytest7may.models.User;
import com.geekster.EcommerseWeeklytest7may.repository.IProductRepo;
import com.geekster.EcommerseWeeklytest7may.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")

public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/")
    void saveUser(@RequestBody Product myProduct){
        productService.save(myProduct);
    }

    @GetMapping("/category/{category}")
    List<Product> getProductByCategoryName(@PathVariable String category){
     return   productService.findByProductCategory(category);
    }
    @DeleteMapping("/{productId}")
    ResponseEntity<Void> removeProductByProductId(@PathVariable Integer productId){
        HttpStatus status;
        try{
        productService.removeProductByProductId(productId);
        status=HttpStatus.OK;
    }
        catch (Exception e){
            System.out.println(e);
            status=HttpStatus.NOT_ACCEPTABLE;
        }
        return new ResponseEntity<Void>(status);

        }

}
