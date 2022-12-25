package com.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.UserDao;
import com.lms.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUser() {

		return userDao.findAll();
	}

	@Override
	public User getUser(long userId) {

		return userDao.getOne(userId);
	}

	@Override
	public User addUser(User u) {

		return userDao.save(u);
	}

	@Override
	public User updateUser(User u) {

		return userDao.save(u);
	}

	@Override
	public void deleteUser(long userId) {

		userDao.deleteById(userId);
	}

}
