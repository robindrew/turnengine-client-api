package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ISystemLoadAverage extends IBean, Comparable<ISystemLoadAverage> {

	int SERIALIZATION_ID = 1215;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the period field.
	 * @return the value of the period field.
	 */
	LoadAveragePeriod getPeriod();

	/**
	 * Getter for the average field.
	 * @return the value of the average field.
	 */
	double getAverage();

	/**
	 * Setter for the period field.
	 * @param period the period value to set.
	 */
	void setPeriod(LoadAveragePeriod period);

	/**
	 * Setter for the average field.
	 * @param average the average value to set.
	 */
	void setAverage(double average);
}
