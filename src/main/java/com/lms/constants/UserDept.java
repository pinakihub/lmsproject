package com.lms.constants;

public enum UserDept {

	INFORMATION_TECHNOLOGY("IT"),
	COMPUTER_SCIENCE("CSE"),
	ELECTRONICS("ECE"),
	MECHANICAL("ME"),
	CIVIL("CE");
	
	String value;
	
	UserDept(String v) {
		this.value=v;
	}

	public String getValue() {
		return value;
	}
}
