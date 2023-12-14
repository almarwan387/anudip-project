package com.example.blooddonatemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.blooddonatemanagementsystem.entities.BloodGroup;
import com.example.blooddonatemanagementsystem.services.BloodGroupService;

@RestController
public class BloodGroupController {

	@Autowired
	BloodGroupService bloodGroupService;
	
	
	@PostMapping("/postBloodGroup")
	public BloodGroup addBloodGroup(@RequestBody BloodGroup bloodGroup) {
		
		return bloodGroupService.addBloodGroup(bloodGroup);
	}
	
	@PutMapping("/updateBloodGroup")
	public BloodGroup update(@RequestHeader int id ,@RequestBody BloodGroup bloodGroup) {
		
		return bloodGroupService.updatedb(id,bloodGroup); 
	}
	@DeleteMapping("/deleteBloodGroup")
	public String delete(@RequestHeader int id) {
		bloodGroupService.Delete(id);
		return "data deleted";
	}
	
	
}
