package com.mftech.communime.type;

/**
 * Represents state of party and their allowed behaviour
 * 
 * @author fred
 * 
 */
public interface Status {

	void Register();

	void Activate();

	void Freeze();

	void Delete();
	
	String name();

}
