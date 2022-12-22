package com.lms.constants;

public enum UserRoles {
	STUDENT("student"),
	TEACHER("teacher");
	String value;
	
	UserRoles(String v) {
		this.value=v;
	}

	public String getValue() {
		return value;
	}

	
	
}
