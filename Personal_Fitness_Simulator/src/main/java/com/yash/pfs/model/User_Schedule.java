package com.yash.pfs.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * 
 * 
 * @author chaitanya
 * This class contains the exercise schedule details of the user 
 */
@Component
@Entity
@Table(name="user_schedule")
public class User_Schedule {
	/**
	 * id of user_schedule table
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	/**
	 * user_id foreign key
	 */
	//@ManyToOne
	//@JoinColumn(name="user_id")
	private int fk_user_id;
	/**
	 * date of the scheduled exercise diet
	 */
	@Column(name="date")
	
	private Date date;
	/**
	 * diet for the particular day
	 */
	@Column(name="diet")
	private String diet;
	/**
	 * exercise for the particular date
	 * 
	 */
	@Column(name="exercise")
	private String exercise;
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

	public int getFk_user_id() {
		return fk_user_id;
	}

	public void setFk_user_id(int fk_user_id) {
		this.fk_user_id = fk_user_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
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
