package com.yash.pfs.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.pfs.dao.UserDao;
import com.yash.pfs.model.User;
import com.yash.pfs.model.User_Schedule;
import com.yash.pfs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public User authenticateUser(User user) {

		return userDao.authenticateUser(user);
	}
	@Transactional
	public  List<User> getUsers(int id) {
		// TODO Auto-generated method stub
		return userDao.getUsers(id);
	}
	@Transactional
	public List<User_Schedule> getUserSchedule(int id,  String todayDate) {
		// TODO Auto-generated method stub
		return userDao.getUserSchedule(id, todayDate);
	}
	@Transactional
	public List<User_Schedule> getUserScheduleList(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserScheduleList(id);
	}

}
