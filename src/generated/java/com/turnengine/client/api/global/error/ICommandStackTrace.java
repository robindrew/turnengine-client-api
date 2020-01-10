package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ICommandStackTrace extends IBean, Comparable<ICommandStackTrace> {

	int SERIALIZATION_ID = 1303;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	long getId();

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	long getTimestamp();

	/**
	 * Getter for the command field.
	 * @return the value of the command field.
	 */
	String getCommand();

	/**
	 * Getter for the trace field.
	 * @return the value of the trace field.
	 */
	String getTrace();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(long id);

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	void setTimestamp(long timestamp);

	/**
	 * Setter for the command field.
	 * @param command the command value to set.
	 */
	void setCommand(String command);

	/**
	 * Setter for the trace field.
	 * @param trace the trace value to set.
	 */
	void setTrace(String trace);
}
