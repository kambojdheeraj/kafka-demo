package com.example.kafka.sample.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

	private static final Logger log = LoggerFactory.getLogger(OrderListener.class);

	@KafkaListener(topics = "tacocloud.orders.topic")
	public void handle(String order) {
		log.info(order);
		System.out.println(order);
	}

}
