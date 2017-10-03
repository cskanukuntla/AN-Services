package com.an.inventoryservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.an.inventoryservice.domain.Inventory;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/inventory")
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
	private List<Inventory> itemList = Arrays.asList(
	        new Inventory(1L, "Brakes", 253),
	        new Inventory(2L, "Wipers", 546),
	        new Inventory(3L, "Rear Mirror", 453),
	        new Inventory(4L, "Front Mirror", 543)
	    );
	 
	    @GetMapping("/{itemId}")
	    public List<Inventory> findRatingsByItemId(@RequestParam Long itemId) {
	        return itemId == null || itemId.equals(0L) ? Collections.emptyList() : itemList.stream().filter(r -> r.getItemId().equals(itemId)).collect(Collectors.toList());
	    }
	 
	    @GetMapping("/all")
	    public List<Inventory> findAllItems() {
	        return itemList;
	    }
}
