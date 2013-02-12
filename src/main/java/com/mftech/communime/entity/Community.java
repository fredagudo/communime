package com.mftech.communime.entity;


import java.util.HashSet;

/**
 * 
 * Defines a community and its members, a community can also be part of another
 * community.
 *  Club, school, social group etc ..
 * 
 * @author fred
 * 
 */
public class Community extends AbstractEntity implements CommunityMember {
	private String name;

	private HashSet<CommunityMember> members;

	public Community(String name) {
		super();
		this.name = name;
		members = new HashSet<CommunityMember>();
	}

	public HashSet<CommunityMember> getMembers() {
		return members;
	}

	public void setMembers(HashSet<CommunityMember> members) {
		this.members = members;
	}

	/**
	 * Add one CommunityMember to the community list
	 * 
	 * @param member
	 */
	public void add(CommunityMember member) {
		if (member == null)
			// todo throw new
			// InvalidMember("Cannot add null member to comminuty");

			if (((Party) member).isNew())
				// todo throw new RuntimeException(Failure.INVALID_STATUS +
				// ": Cannot add incompleted members to community");

				if (members == null)
					members = new HashSet<CommunityMember>();

		members.add(member);
	}

	public void remove(Party member) {
		members.remove(member);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
