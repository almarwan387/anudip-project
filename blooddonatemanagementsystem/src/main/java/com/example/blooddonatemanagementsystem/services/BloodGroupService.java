package com.example.blooddonatemanagementsystem.services;

import com.example.blooddonatemanagementsystem.entities.BloodGroup;

public interface BloodGroupService {
	
	BloodGroup addBloodGroup(BloodGroup BloodGroup);

	BloodGroup updatedb(int id, BloodGroup BloodGroup);

	
	void Delete(int id);
}

