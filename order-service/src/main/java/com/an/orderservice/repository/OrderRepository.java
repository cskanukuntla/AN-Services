package com.an.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.an.orderservice.domain.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {

}
