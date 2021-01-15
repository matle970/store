package com.layerdemo.dao;

import java.util.List;

import com.layerdemo.domain.Customer;

public interface CustomerDao {

	void create(Customer customer);

	void modify(Customer customer);

	void remove(Customer customer);

	Customer findByPk(String pk);

	List<Customer> findAll();
}
