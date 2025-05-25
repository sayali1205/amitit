package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class BankService {
	
	@PostMapping("bank")
	public String postMethodName(@RequestBody String entity) {
		//TODO: process POST request
		
		return entity;
	}
	
	String openAccount(@RequestBody Customer c) {
		
		return "Account open";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("bank/withdraw/{accNo}/{amount}")
//	String withdrawal(@PathVariable int accNo, @PathVariable int amount) {
//		return "Money wwitdrawed";
//	}
//	
//	@GetMapping("bank/check/{accNo}/{pin}")
//	public int checkBalance(@PathVariable int accNo,@PathVariable int pin) {
//		return 1000;
//	}
//	
//	@GetMapping("bank/deposite/{accNo}/{ammount}/{sign}")
//	String deposite(@PathVariable int accNo, @PathVariable int amount,@PathVariable String sign) {
//		return "Money Deposited";
//	}
	

}
