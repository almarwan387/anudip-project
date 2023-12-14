package com.example.blooddonatemanagementsystem.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blooddonatemanagementsystem.entities.BloodBank;
import com.example.blooddonatemanagementsystem.exception.ResourceNotFoundException;
import com.example.blooddonatemanagementsystem.repository.BloodBankRepo;
import com.example.blooddonatemanagementsystem.services.BloodBankService;

@Service
public class BloodBankServiceimplementation implements BloodBankService{
	@Autowired
	BloodBankRepo bloodBankRepo;
	
	@Override
	public BloodBank login(String email, String password) {
		 BloodBank s = bloodBankRepo.findByEmail(email);
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}
	@Override
	public BloodBank addBloodBank(BloodBank BloodBank) {
		// TODO Auto-generated method stub
		return  bloodBankRepo.save(BloodBank);
	}

	@Override
	public BloodBank updatedb(String email, BloodBank BloodBank) {
		// TODO Auto-generated method stub
		
		BloodBank s1 = bloodBankRepo.findByEmail(email);
		
		if(s1!=null) {
			s1.setDonorName(BloodBank.getDonorName());   // old to new set
			s1.setPassword(BloodBank.getPassword());
		return bloodBankRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void Delete(String email) {
		// TODO Auto-generated method stub
		
		BloodBank s2 = bloodBankRepo.findByEmail(email);
		
		if(s2!=null) {
			bloodBankRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}
}
