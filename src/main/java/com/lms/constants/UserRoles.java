package com.lms.constants;

public enum UserRoles {
	STUDENT("STUDENT"),
	TEACHER("TEACHER");
	String value;
	
	UserRoles(String v) {
		this.value=v;
	}

	public String getValue() {
		return value;
	}

	
	public static UserRoles fromString(String s) {
		for(UserRoles r:UserRoles.values()) {
			if(r.getValue().equals(s))
				return r;
		}
		return STUDENT;
	}
}
