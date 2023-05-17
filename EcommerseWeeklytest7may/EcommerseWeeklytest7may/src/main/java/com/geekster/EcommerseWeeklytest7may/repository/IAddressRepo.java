package com.geekster.EcommerseWeeklytest7may.repository;

import com.geekster.EcommerseWeeklytest7may.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {

    Address findByAddressId(Integer addressId);
}
