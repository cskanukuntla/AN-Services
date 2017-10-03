package com.an.inventorybatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.an.inventorybatch.domain.Inventory;
import com.an.inventorybatch.repository.InventoryRepository;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	InventoryRepository inventoryRepository;

	@GetMapping("/all")
	public List<Inventory> findInventory() {
		return inventoryRepository.findAll();
	}

	@GetMapping("/{itemId}")
	public Inventory findItem(@PathVariable Long itemId) {
		return inventoryRepository.findAll().stream().filter(b -> b.getItemId().equals(itemId)).findFirst()
				.orElse(null);
	}

}
