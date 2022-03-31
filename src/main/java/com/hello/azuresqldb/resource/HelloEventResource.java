package com.hello.azuresqldb.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.azuresqldb.entity.HelloEvent;

import reactor.core.publisher.Mono;





@RestController
@RequestMapping("/events")
public interface HelloEventResource {

	@GetMapping("/{eventName}")
	@ResponseBody
    Mono<HelloEvent> getEvent(@PathVariable String eventName);
	
	
	  @PostMapping
	  @ResponseBody 
	  Mono<HelloEvent> insertEvent(@RequestBody HelloEvent helloEvent);
	  
	  @PutMapping
	  @ResponseBody 
	  Mono<HelloEvent> updateEvent(@RequestBody HelloEvent helloEvent);
	 

}
