package com.mftech.communime.type;

import com.mftech.communime.entity.Party;

public class RegisteredStatus implements Status {
	public static final String name = "REGISTERED";
	Party party;

	public RegisteredStatus(Party party) {
		super();
		this.party = party;
	}

	@Override
	public void Register() {
		throw new RuntimeException("Unable to register, already registered");// todo

	}

	@Override
	public void Activate() {
		party.setStatus(new ActiveStatus(party));
	}

	@Override
	public void Freeze() {
		throw new RuntimeException("Unable to freeze, member not active");// todo

	}

	@Override
	public void Delete() {
		party.setStatus(new DeletedStatus(party));

	}

	@Override
	public String name() {
		return name;
	}

}
