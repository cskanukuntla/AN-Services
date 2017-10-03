package com.an.inventorybatch.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.an.inventorybatch.camel.process.InventoryProcessor;
import com.an.inventorybatch.model.Inventory;

@Component
public class InventoryPollerRouteBuilder extends RouteBuilder {

	@Autowired
	InventoryProcessor inventoryProcessor;

	@Override
	public void configure() throws Exception {
		JaxbDataFormat jaxb = new JaxbDataFormat(Inventory.class.getPackage().getName());

		from("file:C:\\Users\\kanukuntlac\\Desktop\\Test\\input?fileName=inventory.xml") //
				.unmarshal(jaxb) //
				.process(inventoryProcessor); //
		// .to("file:C:\\Users\\kanukuntlac\\Desktop\\Test\\output");
	}

}
