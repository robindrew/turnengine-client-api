package com.turnengine.client.api.global.user;

import java.util.regex.Pattern;

public class UserNamePatternValidator {

	private static final Pattern pattern = Pattern.compile("^(?=^.{4,}$)(?=.*[a-zA-Z0-9])(?=.*[\\-_])?.*$");

	public boolean isValid(String username) {
		return pattern.matcher(username).matches();
	}

}
