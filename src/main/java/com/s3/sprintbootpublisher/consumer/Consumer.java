package com.s3.sprintbootpublisher.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.s3.sprintbootpublisher.dummy.Data;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Consumer {

	@RabbitListener(queues = { "${queue.name2}" })
	public void receive(@Payload String message) {

		log.info("Mensaje recibido {}", message);

		makeSlow();

	}

	private void makeSlow() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
