package com.yash.pfs.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yash.pfs.model.User;
import com.yash.pfs.model.User_Schedule;

@Repository
public interface UserDao {
	public User authenticateUser(User user);
	public  List<User> getUsers(int id);
	public List<User_Schedule> getUserSchedule(int id, Date todayDate);
	public List<User_Schedule> getUserScheduleList(int id);
	public void insertSchedule(User_Schedule user_schedule);
}
