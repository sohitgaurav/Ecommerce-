package com.geekster.EcommerseWeeklytest7may.controller;

import com.geekster.EcommerseWeeklytest7may.models.Address;
import com.geekster.EcommerseWeeklytest7may.models.User;
import com.geekster.EcommerseWeeklytest7may.repository.IAddressRepo;
import com.geekster.EcommerseWeeklytest7may.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/")
    void saveUser(@RequestBody Address myAddress){
        addressService.save(myAddress);
    }
    @GetMapping("/{addressId}")
    Address getAddressById(@PathVariable Integer addressId){
     return addressService.getAddressById(addressId);
    }
}
