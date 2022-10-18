package com.se.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Player {
	private int id;
	
	@NotBlank(message = "Name should not be null")
	private String name;
	
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

}
