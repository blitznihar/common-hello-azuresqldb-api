package com.hello.azuresqldb.resource.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.hello.azuresqldb.entity.HelloEvent;
import com.hello.azuresqldb.resource.HelloEventResource;
import com.hello.azuresqldb.service.HelloEventService;

import reactor.core.publisher.Mono;




@Controller
public class HelloEventResourceImpl implements HelloEventResource {

	private static final Logger logger = LoggerFactory.getLogger(HelloEventResourceImpl.class);

	@Autowired
	HelloEventService helloEventService;
	
	@Override
	public Mono<HelloEvent> getEvent(String eventName) {
		logger.info("Request Received for GET Operation");
		return Mono.just(helloEventService.getEvent(eventName));
	}
	
	@Override
	public Mono<HelloEvent> insertEvent(@RequestBody HelloEvent helloEvent) {
		logger.info("Request Received for POST Operation {}", helloEvent.getEventId());
		return Mono.just(helloEventService.insertEvent(helloEvent));
	}
	
	@Override
	public Mono<HelloEvent> updateEvent(@RequestBody HelloEvent helloEvent) {
		logger.info("Request Received for PUT Operation {}", helloEvent.getEventId());
		return Mono.just(helloEventService.updateEvent(helloEvent));
	}


}