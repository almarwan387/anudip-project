package com.example.blooddonatemanagementsystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BloodBank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String donorName;
	@Column(length=30)
	private String emailId;
	@Column(length=50)
	private String password;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "bloodBank [id=" + id + ", donorName=" + donorName + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}
	}
	
	
	
	
	
	