package com.dakr.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@GetMapping("/")
	public String getMessage() {
		return "hello security !!";
	}

}
