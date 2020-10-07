package com.phonerepairforless.repairforLess.data;

import java.util.Date;

public class Order {
	
	private String orderId;
	private String orderStatus;
	private Date orderDate;
	
	public Order() {
		
	}
	
	public Order(String orderId, String orderStatus) {
		this.setOrderId(orderId);
		this.setOrderStatus(orderStatus);
		this.orderDate = new Date();
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
