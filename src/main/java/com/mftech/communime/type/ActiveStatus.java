package com.mftech.communime.type;

import com.mftech.communime.entity.Party;

public class ActiveStatus implements Status {
	public static final String name = "ACTIVE";
	Party party;

	public ActiveStatus(Party party) {
		super();
		this.party = party;
	}

	@Override
	public void Register() {
		throw new RuntimeException("Unable to register, member is active");// todo

	}

	@Override
	public void Activate() {
		throw new RuntimeException("Unable to activate, member is active");// todo

	}

	@Override
	public void Freeze() {
		party.setStatus(new FrozenStatus(party));

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
