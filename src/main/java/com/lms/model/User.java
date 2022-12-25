package com.lms.model;

import com.lms.constants.UserDept;
import com.lms.constants.UserRoles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbluser")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	@Column
	private String userName;
	
	@Column
	private String userPassword;

	@Column
	private boolean isuserverfied;

	@Column
	private long userContact;

	@Column
	private String userBatch;

	@Column
	private String userAddress;

	@Enumerated(EnumType.STRING)
	@Column(name = "userRole")
	private UserRoles role;

	@Enumerated(EnumType.STRING)
	@Column(name = "userDept")
	private UserDept dept;

	@Column(nullable = false)
	private boolean isActive=true;

	public User(long userId, String userName, boolean isuserverfied, long userContact, String userBatch,
			String userAddress, UserRoles role, UserDept dept, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.isuserverfied = isuserverfied;
		this.userContact = userContact;
		this.userBatch = userBatch;
		this.userAddress = userAddress;
		this.role = role;
		this.dept = dept;
		 this.userPassword= userPassword;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public User() {
		super();

	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isIsuserverfied() {
		return isuserverfied;
	}

	public void setIsuserverfied(boolean isuserverfied) {
		this.isuserverfied = isuserverfied;
	}

	public long getUserContact() {
		return userContact;
	}

	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}

	public String getUserBatch() {
		return userBatch;
	}

	public void setUserBatch(String userBatch) {
		this.userBatch = userBatch;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public UserRoles getRole() {
		return role;
	}

	public void setRole(UserRoles role) {
		this.role = role;
	}

	public UserDept getDept() {
		return dept;
	}

	public void setDept(UserDept dept) {
		this.dept = dept;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", isuserverfied=" + isuserverfied + ", userContact=" + userContact + ", userBatch=" + userBatch
				+ ", userAddress=" + userAddress + ", role=" + role + ", dept=" + dept + ", isActive=" + isActive + "]";
	}

	

}
