package com.lms.constants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum UserDept {

	INFORMATION_TECHNOLOGY("IT"),
	COMPUTER_SCIENCE("CSE"),
	ELECTRONICS("ECE"),
	MECHANICAL("ME"),
	CIVIL("CE"),OTHERS("OTHERS");
	
	String value;
	
	UserDept(String v) {
		this.value=v;
	}

	public String getValue() {
		return value;
	}
	
	public static UserDept fromString(String s) {
		for(UserDept v:UserDept.values()) {
			if(v.getValue().equals(s))
				return v;
		}
		return OTHERS;
	}
	
	
}
