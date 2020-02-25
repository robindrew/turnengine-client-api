package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ILocalTrace extends IBean, Comparable<ILocalTrace> {

	int SERIALIZATION_ID = 2401;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	String getId();

	/**
	 * Getter for the datetime field.
	 * @return the value of the datetime field.
	 */
	long getDatetime();

	/**
	 * Getter for the trace field.
	 * @return the value of the trace field.
	 */
	String getTrace();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(String id);

	/**
	 * Setter for the datetime field.
	 * @param datetime the datetime value to set.
	 */
	void setDatetime(long datetime);

	/**
	 * Setter for the trace field.
	 * @param trace the trace value to set.
	 */
	void setTrace(String trace);
}
