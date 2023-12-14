package com.example.blooddonatemanagementsystem.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blooddonatemanagementsystem.entities.BloodGroup;
import com.example.blooddonatemanagementsystem.exception.ResourceNotFoundException;
import com.example.blooddonatemanagementsystem.repository.BloodGroupRepo;
import com.example.blooddonatemanagementsystem.services.BloodGroupService;

@Service
public class BloodGroupServiceimplementation implements BloodGroupService{
	@Autowired
	BloodGroupRepo BloodGroupRepo;
	
	
	@Override
	public BloodGroup addBloodGroup(BloodGroup BloodGroup) {
		// TODO Auto-generated method stub
		return  BloodGroupRepo.save(BloodGroup);
	}

	@Override
	public BloodGroup updatedb(int id, BloodGroup BloodGroup) {
		// TODO Auto-generated method stub
		
		BloodGroup s1 = BloodGroupRepo.findById(id);
		
		if(s1!=null) {
			s1.setDonorName(BloodGroup.getDonorName());   // old to new set
			s1.setTypesOfBlood(BloodGroup.getTypesOfBlood());
		return BloodGroupRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
		BloodGroup s2 = BloodGroupRepo.findById(id);
		
		if(s2!=null) {
			BloodGroupRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}
}
