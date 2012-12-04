package com.mftech.communime.entity;

/**
 * 
 * Physical human being
 * 
 * @author fred
 *
 */
public class Person extends Party{

	private String firstName;
	private String LastName;
	
	
	public Person(String firstName, String lastName ,Integer createdById) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		super.setCreatedById(createdById);
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
