package com.mftech.communime.type;

import com.mftech.communime.entity.Party;

public class FrozenStatus implements Status {
	public static final String name = "FROZEN";
	Party party;

	public FrozenStatus(Party party) {
		super();
		this.party = party;
	}

	@Override
	public void Register() {
		throw new RuntimeException("Unable to register, member frozen");// todo

	}

	@Override
	public void Activate() {
		party.setStatus(new ActiveStatus(party));

	}

	@Override
	public void Freeze() {
		throw new RuntimeException("Unable to freeze, member frozen");// todo

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
