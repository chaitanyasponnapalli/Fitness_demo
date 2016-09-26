package com.yash.pfs.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yash.pfs.model.User;
import com.yash.pfs.model.User_Schedule;

@Service
public interface UserService {
	public User authenticateUser(User user);
	public  List<User> getUsers(int id);
	public List<User_Schedule> getUserSchedule(int id,  String todayDate);
	public List<User_Schedule> getUserScheduleList(int id);
}
