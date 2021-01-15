package com.store.service.imp;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.store.dao.GoodsDao;
import com.store.dao.OrderDao;
import com.store.dao.OrderLineItemDao;
import com.store.dao.imp.GoodsDaoImpJdbc;
import com.store.dao.imp.OrderDaoImpJdbc;
import com.store.dao.imp.OrderLineItemDaoImpJdbc;
import com.store.domain.Goods;
import com.store.domain.OrderLineItem;
import com.store.domain.Orders;
import com.store.service.OrdersService;

public class OrdersServiceImp implements OrdersService {

	GoodsDao goodsDao = new GoodsDaoImpJdbc();
	OrderDao orderDao = new OrderDaoImpJdbc();
	OrderLineItemDao orderLineItemDao = new OrderLineItemDaoImpJdbc();

	@Override
	public String submitOrders(List<Map<String, Object>> cart) {

		Orders orders = new Orders();
		Date date = new Date();
		// 訂單ID
		String ordersid = String.valueOf(date.getTime()) + String.valueOf((int) (Math.random() * 100));
		orders.setId(ordersid);
		orders.setOrderDate(date);
		orders.setStatus(1);
		orders.setTotal(0.0f);
		// 將訂單訊息新增到資料庫
		orderDao.create(orders);
		// 商品總金額
		double total = 0.0;

		for (Map item : cart) {
			// item結構 [商品id， 數量]
			Long goodsid = (Long) item.get("goodsid");
			Integer quantity = (Integer) item.get("quantity");
			Goods goods = goodsDao.findByPk(goodsid);
			// 小金額
			double subtotal = quantity * goods.getPrice();
			total += subtotal;

			OrderLineItem lineItem = new OrderLineItem();
			lineItem.setQuantity(quantity);
			lineItem.setGoods(goods);
			lineItem.setOrders(orders);
			lineItem.setSubTotal(subtotal);

			// 將訂單詳細訊息新增到資料庫
			orderLineItemDao.create(lineItem);
		}

		orders.setTotal((float) total);
		// 更新訂單至資料庫
		orderDao.modify(orders);

		return ordersid;
	}
}
