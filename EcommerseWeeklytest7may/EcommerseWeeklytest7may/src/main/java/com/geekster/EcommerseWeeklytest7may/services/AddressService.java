package com.geekster.EcommerseWeeklytest7may.services;

import com.geekster.EcommerseWeeklytest7may.models.Address;
import com.geekster.EcommerseWeeklytest7may.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public void save(Address myAddress) {
        iAddressRepo.save(myAddress);
    }

    public Address getAddressById(Integer addressId) {
        return iAddressRepo.findByAddressId(addressId);
    }
}
