package com.mftech.communime.entity;

import com.mftech.communime.type.ActiveStatus;
import com.mftech.communime.type.DeletedStatus;
import com.mftech.communime.type.FrozenStatus;
import com.mftech.communime.type.NewStatus;
import com.mftech.communime.type.Status;

/**
 * Represents org , person etc
 * 
 * @author fred
 * 
 */
public abstract class Party extends AbstractEntity {
	private Status status;

	public Party() {
		super();
		status = new NewStatus(this);
	}

	@Override
	public Integer getId() {
		return super.getId(); // todo
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isNew() {
		return (status.name().equalsIgnoreCase(NewStatus.name));
	}

	public boolean isActive() {
		return (status.name().equalsIgnoreCase(ActiveStatus.name));
	}

	public boolean isFrozen() {
		return (status.name().equalsIgnoreCase(FrozenStatus.name));
	}

	public boolean isDeleted() {
		return (status.name().equalsIgnoreCase(DeletedStatus.name));
	}

	public void register() {
		status.Register();
	
	}

	public void activate() {
		status.Activate();

	}

	public void freeze() {
		status.Freeze();
	}

	public void delete() {
		status.Delete();
	}

}
