package com.yash.pfs.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

/**
 * 
 * User model will be used to hold the data from form and perform
 * validation
 * @author chaitanya
 *
 */
@Component
@Entity
@Table(name="users")
public class User {
	/**
	 * id of user
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/**
	 * 
	 * first name of the user
	 */
	@Size(min=2, max=30)
	@NotEmpty(message="First name cannot be empty")
	private String firstname;
	
	/**
	 * 
	 * last name of the user
	 */
	@Size(min=2, max=30)
	@NotEmpty(message="Last name cannot be empty")
	private String lastname;
	
	/**
	 * 
	 * user's email
	 */
	@Email
	@NotEmpty(message="Email cannot be empty")
	private String email;
	
	/**
	 * 
	 * contact of the user
	 */
	@NotEmpty(message="Contact cannot be empty")
	private String contact;
	
	
	/**
	 * 
	 * user's password
	 */
	@NotEmpty(message="Password cannot be empty")
	private String password;
	
	/**
	 * 
	 * user's gender
	 */
	@NotEmpty(message="Gender cannot be empty")
	private String gender;
	
	/**
	 * id of user, who created this user
	 * In case if admin creates the user, in that case admin id will be held
	 * 
	 */
	private int created_by = 2; //default value
	
	/**
	 * id of user, who modified the record of user
	 */

	private int last_modified_by = 3; //default value
	
	/**
	 * this will hold for the date on which user is registered
	 * may be by himself or by some other user
	 */
	private Timestamp created_date;
	
	/**
	 * If user is modified, then modified date
	 * must be stored in system automatically
	 */
	private Timestamp last_modified_date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public int getLast_modified_by() {
		return last_modified_by;
	}

	public void setLast_modified_by(int last_modified_by) {
		this.last_modified_by = last_modified_by;
	}

	public Timestamp getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}

	public Timestamp getLast_modified_date() {
		return last_modified_date;
	}

	public void setLast_modified_date(Timestamp last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	
	
}
