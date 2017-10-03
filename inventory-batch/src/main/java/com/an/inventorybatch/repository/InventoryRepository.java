package com.an.inventorybatch.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.an.inventorybatch.domain.Inventory;

@Repository
public interface InventoryRepository extends MongoRepository<Inventory, Long> {

}
