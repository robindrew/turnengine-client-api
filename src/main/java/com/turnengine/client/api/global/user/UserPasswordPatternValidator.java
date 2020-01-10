package com.turnengine.client.api.global.user;

import java.util.regex.Pattern;

public class UserPasswordPatternValidator {

	private static final Pattern pattern = Pattern.compile("^(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");

	public boolean isValid(String password) {
		return pattern.matcher(password).matches();
	}

}
