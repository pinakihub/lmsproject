package com.lms.dao;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.IssueBook;





@Repository
public interface IssueBookDao extends JpaRepository<IssueBook, Long>{
	
	List<IssueBook> findAllByIssuedate(Date today);
	List<IssueBook> findAllByReturnedDate(Date today);
	List<IssueBook> findAllByDueDate(Date today);
}
