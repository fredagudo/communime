package com.mftech.communime.entity;

/**
 * Physical organisation
 * 
 * @author fred
 *
 */
public class Org extends Party {
    private String name;

	public Org(String name, int createdById) {
		this.name = name;
		this.setCreatedById(createdById);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
   

    
}
