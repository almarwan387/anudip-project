package com.example.blooddonatemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.blooddonatemanagementsystem.entities.BloodGroup;
@Repository
public interface BloodGroupRepo extends JpaRepository<BloodGroup, Integer> {

	@Query(value =  "select * from BloodGroup where id=?" , nativeQuery = true)
	BloodGroup findById(int id);

}
	
	
