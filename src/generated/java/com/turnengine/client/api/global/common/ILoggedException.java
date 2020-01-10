package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ILoggedException extends IBean, Comparable<ILoggedException> {

	int SERIALIZATION_ID = 1224;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	long getTimestamp();

	/**
	 * Getter for the level field.
	 * @return the value of the level field.
	 */
	String getLevel();

	/**
	 * Getter for the className field.
	 * @return the value of the className field.
	 */
	String getClassName();

	/**
	 * Getter for the message field.
	 * @return the value of the message field.
	 */
	String getMessage();

	/**
	 * Getter for the trace field.
	 * @return the value of the trace field.
	 */
	String getTrace();

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	void setTimestamp(long timestamp);

	/**
	 * Setter for the level field.
	 * @param level the level value to set.
	 */
	void setLevel(String level);

	/**
	 * Setter for the className field.
	 * @param className the className value to set.
	 */
	void setClassName(String className);

	/**
	 * Setter for the message field.
	 * @param message the message value to set.
	 */
	void setMessage(String message);

	/**
	 * Setter for the trace field.
	 * @param trace the trace value to set.
	 */
	void setTrace(String trace);
}
