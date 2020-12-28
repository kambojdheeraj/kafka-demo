package com.example.kafka.sample.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaOrderMessagingService {

	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	public KafkaOrderMessagingService(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendOrder() {
		kafkaTemplate.send("tacocloud.orders.topic", "order send");
	}
}
