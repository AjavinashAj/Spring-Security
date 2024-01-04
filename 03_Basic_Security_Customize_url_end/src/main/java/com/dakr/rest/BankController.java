package com.dakr.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/")
	public String welcomeMessage() {
		return"welcome to new Bank !!!";
	}
	
	//deposit

	@GetMapping("/deposit")
	public String depositMessage() {
		return "4000 credit successfully....";
	}
	
	//for withdraw
	@GetMapping("/withdraw")
	public String withdrawMessage() {
		return "5000 :withdraw from,90XXX successfully !!  ";
	}
	
	// for account statement
	@GetMapping("/balance")
	public String account() {
		return"balance:90000";
	}
	
	
}
