package com.phonerepairforless.repairforLess.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.phonerepairforless.repairforLess.data.Order;
import com.phonerepairforless.repairforLess.exception.ConflictException;

@RestController
public class OrderController {
	
	@GetMapping("/orderStatus/{orderId}")
	public Order getOrderStatus(@PathVariable String orderId) {
		
		if(orderId.equals("3")) {
			throw new ConflictException();
		}
		
		return new Order(orderId, "Progress");
	}

}
