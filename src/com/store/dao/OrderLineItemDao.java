package com.store.dao;

import java.util.List;

import com.store.domain.OrderLineItem;

public interface OrderLineItemDao {
	OrderLineItem findByPk(long pk);
	List<OrderLineItem> findAll();
	
	void create(OrderLineItem LineItem);
	
	void modify(OrderLineItem LineItem);
	
	void remove(int pk);
}
