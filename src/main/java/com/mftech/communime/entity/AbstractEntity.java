package com.mftech.communime.entity;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 * Base class for all persistence entities
 * 
 * @author fred
 * 
 */

@MappedSuperclass
public abstract class AbstractEntity {
	private Integer id;
	private Integer createdById;
	private Date createdDate;

	public AbstractEntity() {
		super();
		this.createdDate = new Date();
	}

	@Transient
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {

	}

	//todo assert
	public Integer getCreatedById() {
		return createdById;
	}

	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

/*	@Override  //todo
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdById == null) ? 0 : createdById.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity other = (AbstractEntity) obj;
		if (createdById == null) {
			if (other.createdById != null)
				return false;
		} else if (!createdById.equals(other.createdById))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	*/
	
}
