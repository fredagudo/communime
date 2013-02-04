package com.mftech.communime.type;

import com.mftech.communime.entity.Party;

public class NewStatus implements Status {
	public static final String name = "NEW";
	Party party;

	public NewStatus(Party party) {
		super();
		this.party = party;
	}

	@Override
	public void Register() {
		party.setStatus(new RegisteredStatus(party));

	}

	@Override
	public void Activate() {
		throw new RuntimeException("Unable to activate, complete registration first");// todo

	}

	@Override
	public void Freeze() {
		throw new RuntimeException("Unable to freeze, complete registration first");// todo

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
