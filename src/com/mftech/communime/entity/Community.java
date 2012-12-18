package com.mftech.communime.entity;

import java.util.ArrayList;

import com.mftech.communime.exception.Failure;
import com.mftech.communime.exception.InvalidMember;
import com.mftech.communime.exception.InvalidStatus;

/**
 * Club, school, social group etc ..
 * 
 * @author fred
 * 
 */
public class Community extends AbstractEntity {
	private ArrayList<Party> members;

	public Community() {
		super();
		members = new ArrayList<Party>();
	}

	public ArrayList<Party> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Party> members) {
		this.members = members;
	}

	/**
	 * Add one member to the community list
	 * 
	 * @param member
	 */
	public void add(Party member) {
		if (member == null)
		//todo	throw new InvalidMember("Cannot add null member to comminuty");

		if (member.isNew())
		//todo	throw new RuntimeException(Failure.INVALID_STATUS + ": Cannot add incompleted members to community");

		if (members == null)
			members = new ArrayList<Party>();

		members.add(member);
	}

	public void remove(Party member) {
		members.remove(member);

	}
}
