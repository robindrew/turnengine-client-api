package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface INewTranslation extends IExecutableBean<Integer>, IGlobalLoggedInBean<Integer>, Comparable<INewTranslation> {

	int SERIALIZATION_ID = 1601;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	long getLoginId();

	/**
	 * Getter for the english field.
	 * @return the value of the english field.
	 */
	String getEnglish();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the english field.
	 * @param english the english value to set.
	 */
	void setEnglish(String english);
}
