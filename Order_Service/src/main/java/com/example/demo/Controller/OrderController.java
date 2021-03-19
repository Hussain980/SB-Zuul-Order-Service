package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Value("${server.port}")
	private int portNumber;

	@GetMapping("/")
	public String orderDetails() {
		return "Order details";
	}
	
	@GetMapping("/port")
	public int getPortNumber() {
		return portNumber;
	}
}
