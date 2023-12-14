package com.example.blooddonatemanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BloodGroup {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String donorName;
	private String typesOfBlood;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getTypesOfBlood() {
		return typesOfBlood;
	}
	public void setTypesOfBlood(String typesOfBlood) {
		this.typesOfBlood = typesOfBlood;
	}
	@Override
	public String toString() {
		return "bloodGroup [id=" + id + ", donorName=" + donorName + ", typesOfBlood=" + typesOfBlood + ", getId()="
				+ getId() + ", getDonorName()=" + getDonorName() + ", getTypesOfBlood()=" + getTypesOfBlood()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
	
	
	