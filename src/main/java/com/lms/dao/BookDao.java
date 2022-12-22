package com.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.Books;

@Repository
public interface BookDao extends JpaRepository<Books, Long>{

	
}
