package com.store.domain;

import java.util.Date;
import java.util.List;

public class Orders {
	/* 訂單id */
	private String id;
	/* 訂單時間 */
	private Date orderDate;
	/* 訂單狀態 1:代表待確認 0:代表已確認 */
	private int status = 1;
	/* 訂單金額 */
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
