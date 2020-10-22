package com.sushils.repository;

import com.sushils.dto.OrderResponse;
import com.sushils.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepoitory extends JpaRepository<Customer,Integer> {

    //@Query("select c.name , p.pName from customer c join c.product p")
   // public String getJoinInformation(); // By using single records refer this way..

    //By using DTo class and join multiple feilds use below way..

    @Query("SELECT new com.sushils.dto.OrderResponse(c.name , p.pName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
