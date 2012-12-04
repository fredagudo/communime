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

}
