package com.revature.model;

public class Role {

	int role_id;
	String name;
	public Role(String name, int role_id) {
	
		this.name = name;
		this.role_id = role_id;
	
	}
	
	public Role() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", name=" + name + "]";
	}

	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}