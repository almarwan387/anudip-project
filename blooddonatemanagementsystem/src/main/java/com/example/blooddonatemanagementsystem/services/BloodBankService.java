package com.example.blooddonatemanagementsystem.services;

import com.example.blooddonatemanagementsystem.entities.BloodBank;

public interface BloodBankService {
	BloodBank login(String email ,String password);

	BloodBank addBloodBank(BloodBank BloodBank);

	BloodBank updatedb(String email, BloodBank BloodBank);

	
	void Delete(String email);
}