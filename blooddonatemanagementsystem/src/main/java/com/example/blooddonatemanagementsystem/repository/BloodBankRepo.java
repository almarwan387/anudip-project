package com.example.blooddonatemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.blooddonatemanagementsystem.entities.BloodBank;

@Repository
public interface BloodBankRepo extends JpaRepository<BloodBank, Integer> {

	@Query(value =  "select * from BloodBank where emailId =?" , nativeQuery = true)
	BloodBank findByEmail(String email);

	
}
	
