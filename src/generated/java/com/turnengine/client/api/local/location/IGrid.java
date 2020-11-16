package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface IGrid extends IBean, Comparable<IGrid> {

	int SERIALIZATION_ID = 2828;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the width field.
	 * @return the value of the width field.
	 */
	int getWidth();

	/**
	 * Getter for the height field.
	 * @return the value of the height field.
	 */
	int getHeight();

	/**
	 * Getter for the startLocationId field.
	 * @return the value of the startLocationId field.
	 */
	int getStartLocationId();

	/**
	 * Getter for the finishLocationId field.
	 * @return the value of the finishLocationId field.
	 */
	int getFinishLocationId();

	/**
	 * Getter for the gridList field.
	 * @return the value of the gridList field.
	 */
	List<IGrid> getGridList();

	/**
	 * Setter for the width field.
	 * @param width the width value to set.
	 */
	void setWidth(int width);

	/**
	 * Setter for the height field.
	 * @param height the height value to set.
	 */
	void setHeight(int height);

	/**
	 * Setter for the startLocationId field.
	 * @param startLocationId the startLocationId value to set.
	 */
	void setStartLocationId(int startLocationId);

	/**
	 * Setter for the finishLocationId field.
	 * @param finishLocationId the finishLocationId value to set.
	 */
	void setFinishLocationId(int finishLocationId);

	/**
	 * Setter for the gridList field.
	 * @param gridList the gridList value to set.
	 */
	void setGridList(List<IGrid> gridList);
}
