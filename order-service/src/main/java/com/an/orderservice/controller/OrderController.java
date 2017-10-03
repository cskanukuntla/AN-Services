package com.an.orderservice.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.an.orderservice.domain.Item;
import com.an.orderservice.domain.Order;
import com.an.orderservice.domain.OrderLine;
import com.an.orderservice.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderRepository orderRepository;

	private List<Order> orderList = Arrays.asList(
			new Order(1L, new Date(),
					Arrays.asList(new OrderLine(11L, new Item(111L, "Brakes", BigDecimal.valueOf(250.00))),
							new OrderLine(12L, new Item(111L, "Rear Mirror", BigDecimal.valueOf(50.00))))),
			new Order(2L, new Date(),
					Arrays.asList(new OrderLine(21L, new Item(211L, "Wipers", BigDecimal.valueOf(50.00))),
							new OrderLine(22L, new Item(211L, "Front Mirror", BigDecimal.valueOf(50.00))))));

	@GetMapping("")
	public List<Order> findAllOrder() {
		return orderRepository.findAll();
	}

	@GetMapping("/{orderId}")
	public Order findOrder(@PathVariable Long orderId) {
		return orderRepository.findOne(orderId);
	}

	@GetMapping("/create")
	public void createOrders() {
		orderList.forEach(order -> orderRepository.save(order));
	}
}
