package com.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
