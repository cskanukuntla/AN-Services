package com.an.inventorybatch.camel.process;

import java.util.Optional;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.an.inventorybatch.model.Inventory;
import com.an.inventorybatch.repository.InventoryRepository;

@Component
public class InventoryProcessor implements Processor {

	private static final Logger LOGGER = Logger.getLogger(InventoryProcessor.class);

	@Autowired
	private InventoryRepository inventoryRepository;

	public void process(Exchange exchange) throws Exception {
		Inventory inventory = exchange.getIn().getBody(Inventory.class);

		LOGGER.info("Inventory message =" + inventory.toString());

		Optional.ofNullable(inventory).ifPresent(inv -> inv.getItems().getItem().forEach(item -> {
			com.an.inventorybatch.domain.Inventory dbInventory = new com.an.inventorybatch.domain.Inventory();
			dbInventory.setItemDesc(item.getItemDesc());
			dbInventory.setItemId(item.getItemId());
			dbInventory.setQuantity(item.getQuantity());

			inventoryRepository.save(dbInventory);
		}));

	}

}
