package com.an.gateway;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GatewayApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testAccess() {
		TestRestTemplate testRestTemplate = new TestRestTemplate();
		String testUrl = "http://localhost:8080";

		ResponseEntity<String> response = testRestTemplate.getForEntity(testUrl + "/order-service/orders",
				String.class);
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
		Assert.assertNotNull(response.getBody());
	}
}
