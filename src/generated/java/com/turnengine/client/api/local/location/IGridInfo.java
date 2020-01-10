package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface IGridInfo extends IBean, Comparable<IGridInfo> {

	int SERIALIZATION_ID = 5728;

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
	 * Getter for the owned field.
	 * @return the value of the owned field.
	 */
	int getOwned();

	/**
	 * Getter for the allied field.
	 * @return the value of the allied field.
	 */
	int getAllied();

	/**
	 * Getter for the hostile field.
	 * @return the value of the hostile field.
	 */
	int getHostile();

	/**
	 * Getter for the gridList field.
	 * @return the value of the gridList field.
	 */
	List<IGridInfo> getGridList();

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
	 * Setter for the owned field.
	 * @param owned the owned value to set.
	 */
	void setOwned(int owned);

	/**
	 * Setter for the allied field.
	 * @param allied the allied value to set.
	 */
	void setAllied(int allied);

	/**
	 * Setter for the hostile field.
	 * @param hostile the hostile value to set.
	 */
	void setHostile(int hostile);

	/**
	 * Setter for the gridList field.
	 * @param gridList the gridList value to set.
	 */
	void setGridList(List<IGridInfo> gridList);
}
