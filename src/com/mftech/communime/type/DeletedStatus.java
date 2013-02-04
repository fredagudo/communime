package com.mftech.communime.type;

import com.mftech.communime.entity.Party;

public class DeletedStatus implements Status {
	public static final String name = "DELETED";
	Party party;
	
	public DeletedStatus(Party party) {
		super();
		this.party = party;
	}
	
	@Override
	public void Register() {
		throw new RuntimeException("Unable to register, member deleted");// todo		
		
	}

	@Override
	public void Activate() {
		party.setStatus(new ActiveStatus(party));
		
	}

	@Override
	public void Freeze() {
		throw new RuntimeException("Unable to freeze, member deleted");// todo
		
	}

	@Override
	public void Delete() {
		throw new RuntimeException("Unable to delete, member deleted");// todo	
	}

	@Override
	public String name() {
		return name;
	}

}
