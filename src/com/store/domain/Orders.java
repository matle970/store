package com.store.domain;

import java.util.Date;
import java.util.List;

public class Orders {
	/* �q��id */
	private String id;
	/* �q��ɶ� */
	private Date orderDate;
	/* �q�檬�A 1:�N��ݽT�{ 0:�N��w�T�{ */
	private int status = 1;
	/* �q����B */
	private Float total;

//	private List<OrderLineItem> OrderLineItems;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

}
