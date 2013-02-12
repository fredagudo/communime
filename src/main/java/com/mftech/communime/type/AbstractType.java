package com.mftech.communime.type;

/**
 * 
 * Class representing type and statuses
 * 
 * @author fred
 * 
 */
public abstract class AbstractType {

	private Integer id;
	private String name;
	private String description;

	public AbstractType() {
		super();
	}

	public AbstractType(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
