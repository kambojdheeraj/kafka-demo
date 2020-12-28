package com.example.kafka.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;

import com.example.kafka.sample.sender.KafkaOrderMessagingService;

@SpringBootTest
@DirtiesContext
@EmbeddedKafka(partitions = 1, brokerProperties = { "listeners=PLAINTEXT://localhost:9092", "port=9092" })
class SampleApplicationTests {

	@Autowired
	private KafkaOrderMessagingService producer;

	@Test
	public void testMessageSend() throws Exception {
		producer.sendOrder();
	}
}
