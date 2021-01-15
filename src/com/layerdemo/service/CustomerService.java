package com.layerdemo.service;

import java.util.List;

import com.layerdemo.domain.Customer;

public interface CustomerService {

    boolean login(Customer customer);

    boolean register(Customer customer);

    List<Customer> search();
}
