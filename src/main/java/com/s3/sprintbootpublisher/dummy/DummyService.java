package com.s3.sprintbootpublisher.dummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s3.sprintbootpublisher.publisher.Publisher;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DummyService {

	@Autowired
	private Publisher publisher;
	
	public void sendToRabbit(String message) {	

		log.info("Mensaje '{}' fue enviado ... ", message);
		this.publisher.send(message);
	}
	
}
