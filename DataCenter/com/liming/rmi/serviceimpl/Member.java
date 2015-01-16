package com.liming.rmi.serviceimpl;

import java.io.Serializable;

public class Member implements Serializable{
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
