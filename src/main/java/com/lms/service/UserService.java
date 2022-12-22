package com.lms.service;

import java.util.List;


import com.lms.model.User;

public interface UserService {

	
	public List<User> getAllUser();

	public User getUser(long userId);
	public User addUser(User u);
	public User updateUser(User u);
	public void deleteUser(long userId);
	
	
}
