package com.geekster.EcommerseWeeklytest7may.services;

import com.geekster.EcommerseWeeklytest7may.models.Address;
import com.geekster.EcommerseWeeklytest7may.models.Order;
import com.geekster.EcommerseWeeklytest7may.models.Product;
import com.geekster.EcommerseWeeklytest7may.models.User;
import com.geekster.EcommerseWeeklytest7may.repository.IAddressRepo;
import com.geekster.EcommerseWeeklytest7may.repository.IOrderRepo;
import com.geekster.EcommerseWeeklytest7may.repository.IProductRepo;
import com.geekster.EcommerseWeeklytest7may.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;
    @Autowired
    IUserRepo iUserRepo;
    @Autowired
    IProductRepo iProductRepo;
    @Autowired
    IAddressRepo iAddressRepo;
    public void createOrder(Order myOrder) {
        Integer addressId= myOrder.getOrderAddress().getAddressId();
        Address myAddress= iAddressRepo.findByAddressId(addressId);


        Integer productId =myOrder.getOrderProduct().getProductId();
        Product myProduct=iProductRepo.findByProductId(productId);


        Long userId= myOrder.getOrderUser().getUserId();
        User myUser=iUserRepo.findByUserId(userId);

        if(myAddress!= null && myProduct!= null  &&  myUser!= null ) {

            myOrder.setOrderAddress(myAddress);
            myOrder.setOrderProduct(myProduct);
            myOrder.setOrderUser(myUser);
            iOrderRepo.save(myOrder);
        }
        else{
            throw new IllegalStateException("id sent for creating order ids not valid");
        }


    }

    public Order fetchOrder(Long orderId) {

        return iOrderRepo.findByOrderId(orderId);
    }
}
