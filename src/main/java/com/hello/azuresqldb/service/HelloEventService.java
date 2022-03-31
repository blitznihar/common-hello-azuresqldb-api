package com.hello.azuresqldb.service;

import org.springframework.stereotype.Service;
import com.hello.azuresqldb.entity.HelloEvent;

@Service
public interface HelloEventService {

    
	  HelloEvent getEvent(String eventName);
	
	  HelloEvent insertEvent(HelloEvent helloEvent);
	  
	  HelloEvent updateEvent(HelloEvent helloEvent);
	 

}
