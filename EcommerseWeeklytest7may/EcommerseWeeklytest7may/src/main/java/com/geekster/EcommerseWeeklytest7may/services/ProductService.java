package com.geekster.EcommerseWeeklytest7may.services;

import com.geekster.EcommerseWeeklytest7may.models.Product;
import com.geekster.EcommerseWeeklytest7may.repository.IProductRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public void save(Product myProduct) {
        iProductRepo.save(myProduct);
    }

    public List<Product> findByProductCategory(String category) {
        return iProductRepo.findByProductCategory(category);
    }


    public void removeProductByProductId(Integer productId) {
        //see if id exist
        boolean isPresent= iProductRepo.existsById(productId);

        // delete by id

        if(isPresent){
         iProductRepo.deleteById(productId);
        }

        //exception
        else{
            throw new EntityNotFoundException("id is not valid for deletion  ");
        }
    }
}
