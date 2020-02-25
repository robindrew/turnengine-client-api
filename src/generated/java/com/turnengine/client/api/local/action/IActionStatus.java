package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IActionStatus extends IBean, Comparable<IActionStatus> {

	int SERIALIZATION_ID = 2032;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	long getAmount();

	/**
	 * Getter for the format field.
	 * @return the value of the format field.
	 */
	String getFormat();

	/**
	 * Getter for the content field.
	 * @return the value of the content field.
	 */
	String getContent();

	/**
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	void setAmount(long amount);

	/**
	 * Setter for the format field.
	 * @param format the format value to set.
	 */
	void setFormat(String format);

	/**
	 * Setter for the content field.
	 * @param content the content value to set.
	 */
	void setContent(String content);
}
