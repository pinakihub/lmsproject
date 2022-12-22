package com.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.Suggest;

@Repository
public interface SuggestDao extends JpaRepository<Suggest, Long>{

}
