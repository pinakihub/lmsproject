package com.lms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.model.Admin;
import com.lms.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin get(Long id) {
		return adminRepository.findById(id).get();
	}
	
	public Admin addNew(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public void delete(Admin admin) {
		adminRepository.delete(admin);
	}
	
	public void delete(Long id) {
		adminRepository.deleteById(id);
	}
}
