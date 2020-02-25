package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface IMobileQueueItem extends IBean, Comparable<IMobileQueueItem> {

	int SERIALIZATION_ID = 3032;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	int getId();

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	MobileQueueType getType();

	/**
	 * Getter for the index field.
	 * @return the value of the index field.
	 */
	int getIndex();

	/**
	 * Getter for the repeat field.
	 * @return the value of the repeat field.
	 */
	boolean getRepeat();

	/**
	 * Getter for the location field.
	 * @return the value of the location field.
	 */
	ILocationInfo getLocation();

	/**
	 * Getter for the mobile field.
	 * @return the value of the mobile field.
	 */
	IMobileInfo getMobile();

	/**
	 * Getter for the turns field.
	 * @return the value of the turns field.
	 */
	int getTurns();

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	List<IUnitCount> getUnitList();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(MobileQueueType type);

	/**
	 * Setter for the index field.
	 * @param index the index value to set.
	 */
	void setIndex(int index);

	/**
	 * Setter for the repeat field.
	 * @param repeat the repeat value to set.
	 */
	void setRepeat(boolean repeat);

	/**
	 * Setter for the location field.
	 * @param location the location value to set.
	 */
	void setLocation(ILocationInfo location);

	/**
	 * Setter for the mobile field.
	 * @param mobile the mobile value to set.
	 */
	void setMobile(IMobileInfo mobile);

	/**
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	void setTurns(int turns);

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	void setUnitList(List<IUnitCount> unitList);
}
