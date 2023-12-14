package com.example.blooddonatemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.blooddonatemanagementsystem.entities.BloodBank;
import com.example.blooddonatemanagementsystem.services.BloodBankService;

@RestController
public class  BloodBankController {

	@Autowired
	 BloodBankService  bloodBankService;
	
	@GetMapping("/login")
	public BloodBank login(@RequestHeader String email ,
			@RequestHeader String password) {
		
		return bloodBankService.login(email, password); 
	}	
	@PostMapping("/postbloodBank ")
	public BloodBank addBloodBank (@RequestBody  BloodBank  bloodBank ) {
		
		return  bloodBankService.addBloodBank ( bloodBank );
	}
	
	@PutMapping("/updatebloodBank ")
	public  BloodBank update(@RequestHeader String email ,@RequestBody  BloodBank   bloodBank ) {
		
		return  bloodBankService.updatedb( email , bloodBank ); 
	}
	@DeleteMapping("/deletebloodBank ")
	public String delete(@RequestHeader String email  ) {
		 bloodBankService.Delete( email );
		return "data deleted";
	}
	
	
}

