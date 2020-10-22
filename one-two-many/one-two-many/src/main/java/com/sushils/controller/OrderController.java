package com.sushils.controller;

import com.sushils.dto.OrderRequest;
import com.sushils.dto.OrderResponse;
import com.sushils.entity.Customer;
import com.sushils.repository.CustomerRepoitory;
import com.sushils.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepoitory customerRepoitory;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request)
    {
        return customerRepoitory.save(request.getCustomer());
    }
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrder()
    {
        return customerRepoitory.findAll();
    }
    @GetMapping("/getJoinInfo")
    public List<OrderResponse> getJoinInformation()
    {
        return customerRepoitory.getJoinInformation();
    }
}
