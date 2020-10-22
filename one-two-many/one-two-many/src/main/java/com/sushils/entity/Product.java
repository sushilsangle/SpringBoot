package com.sushils.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Product {

    @Id
    //add ID here manually
    private int pid;
    @NotNull
    private String pName;
    private int qty;
    private int price;


}
