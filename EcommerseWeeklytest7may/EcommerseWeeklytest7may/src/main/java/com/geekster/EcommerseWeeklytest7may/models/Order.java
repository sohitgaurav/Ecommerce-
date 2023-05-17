package com.geekster.EcommerseWeeklytest7may.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Integer productCountNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    private  User orderUser;
    @ManyToOne(cascade = CascadeType.ALL)
    private  Address orderAddress;
    @ManyToOne(cascade = CascadeType.ALL)
    private Product orderProduct;

}
