package com.hello.azuresqldb.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.azuresqldb.entity.HelloEvent;
import com.hello.azuresqldb.repository.HelloEventRepository;
import com.hello.azuresqldb.resource.impl.HelloEventResourceImpl;
import com.hello.azuresqldb.service.HelloEventService;

@Service
public class HelloEventServiceImpl implements HelloEventService {

	private static final Logger logger = LoggerFactory.getLogger(HelloEventResourceImpl.class);
	
	@Autowired
	private HelloEventRepository helloEventRepository;
	
	@Override
	public HelloEvent getEvent(String eventName) {
		logger.info("Request received for eventName {}",eventName );
		return helloEventRepository.findByEventName(eventName);
	}
	
	@Override
	public HelloEvent insertEvent(HelloEvent helloEvent) {
		logger.info("Request received to insert event for {}", helloEvent.getEventId());
		return helloEventRepository.save(helloEvent);
	}
	
	@Override
	public HelloEvent updateEvent(HelloEvent helloEvent) {
		logger.info("Request received to update event for {}", helloEvent.getEventId());
		HelloEvent currentHelloEvent = helloEventRepository.getById(helloEvent.getEventId());
		currentHelloEvent.setEventName(helloEvent.getEventName());
		return helloEventRepository.save(helloEvent);
	}


}
