package com.yash.pfs.daoImpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.pfs.dao.UserDao;
import com.yash.pfs.model.User;
import com.yash.pfs.model.User_Schedule;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public User authenticateUser(User userDetail) {
		
		User uDetail = null;
		try{
			Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
			criteria.add(Restrictions.and(Restrictions.eq("email", userDetail.getEmail()), Restrictions.eq("password", userDetail.getPassword())));
			uDetail = (User) criteria.uniqueResult();
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		return uDetail;
	}

	public List<User> getUsers(int id) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.ne("id", id));
		List<User> compLocList = (List<User>) criteria.list();
		return compLocList;
	}

	public List<User_Schedule> getUserSchedule(int id,  Date todayDate) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(User_Schedule.class);
		criteria.add(Restrictions.eq("fk_user_id", id));
		criteria.add(Restrictions.eq("date", todayDate));
		List<User_Schedule> compLocList = (List<User_Schedule>) criteria.list();
		return compLocList;
	}

	public List<User_Schedule> getUserScheduleList(int id) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(User_Schedule.class);
		criteria.add(Restrictions.eq("fk_user_id", id));
		List<User_Schedule> compLocList = (List<User_Schedule>) criteria.list();
		return compLocList;
	}

	public void insertSchedule(User_Schedule user_schedule) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user_schedule);		
	}

}
