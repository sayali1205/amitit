package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	@GetMapping("/bank")
	public String getBankDetails(String type) {
		
		return "SBI";
	}

}
