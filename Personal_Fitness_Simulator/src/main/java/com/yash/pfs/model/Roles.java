package com.yash.pfs.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Roles {
	
	@Id
	
	private int role_id;
	
	private String role_name;
	
	/**
	 * Gets the id of this role
	 * @return id of role
	 */
	public int getRole_id() {
		return role_id;
	}
	
	/**
	 * Sets the id of this role
	 * @param role_id to change to
	 */
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	/**
	 * Gets the name of this role
	 * @return name of role
	 */
	public String getRole_name() {
		return role_name;
	}
	
	/**
	 * Sets the name of this role
	 * @param role_name to change to
	 */
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
}