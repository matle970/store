package com.store.domain;

public class OrderLineItem {
	/* �q��Բ�id */
	public long id;
	/* �ƶq */
	public int quantity;
	/* �`���B */
	public Double subTotal;
	/* �q�� */
	public Orders orders;
	/* �ӫ~ */
	public Goods goods;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
}
