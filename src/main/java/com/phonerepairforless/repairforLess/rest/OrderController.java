package com.phonerepairforless.repairforLess.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@GetMapping("/orderStatus/{orderId}")
	public String getOrderStatus(@PathVariable String orderId) {
		
		return "Your Order Status for Order id " + orderId + " is In progress";
	}

}
