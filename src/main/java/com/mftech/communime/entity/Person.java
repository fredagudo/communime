package com.mftech.communime.entity;

import com.mftech.communime.type.NewStatus;
import com.mftech.communime.type.Status;

/**
 * 
 * Physical human being
 * 
 * @author fred
 * 
 */
public class Person extends Party {

	private String firstName;
	private String LastName;

	public Person(String firstName, String lastName, Integer createdById) {
		super.setCreatedById(createdById);
		this.firstName = firstName;
		this.LastName = lastName;
		this.setStatus(new NewStatus(this));
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}



}
