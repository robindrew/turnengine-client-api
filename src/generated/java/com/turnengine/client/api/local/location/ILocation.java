package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.turnengine.client.api.local.action.IActionExecuting;
import com.turnengine.client.api.local.mobile.IMobileInfo;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface ILocation extends IBean, INamedIdentity, Comparable<ILocation> {

	int SERIALIZATION_ID = 2803;

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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the coordinates field.
	 * @return the value of the coordinates field.
	 */
	int[] getCoordinates();

	/**
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	int getGroupId();

	/**
	 * Getter for the player field.
	 * @return the value of the player field.
	 */
	IPlayerInfo getPlayer();

	/**
	 * Getter for the signup field.
	 * @return the value of the signup field.
	 */
	LocationSignup getSignup();

	/**
	 * Getter for the signupFactionId field.
	 * @return the value of the signupFactionId field.
	 */
	int getSignupFactionId();

	/**
	 * Getter for the locationUnitList field.
	 * @return the value of the locationUnitList field.
	 */
	List<IUnitCount> getLocationUnitList();

	/**
	 * Getter for the mobileUnitList field.
	 * @return the value of the mobileUnitList field.
	 */
	List<IUnitCount> getMobileUnitList();

	/**
	 * Getter for the actionExecutingList field.
	 * @return the value of the actionExecutingList field.
	 */
	List<IActionExecuting> getActionExecutingList();

	/**
	 * Getter for the upkeepList field.
	 * @return the value of the upkeepList field.
	 */
	List<IUnitCount> getUpkeepList();

	/**
	 * Getter for the mobileList field.
	 * @return the value of the mobileList field.
	 */
	List<IMobileInfo> getMobileList();

	/**
	 * Getter for the previousId field.
	 * @return the value of the previousId field.
	 */
	int getPreviousId();

	/**
	 * Getter for the nextId field.
	 * @return the value of the nextId field.
	 */
	int getNextId();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the coordinates field.
	 * @param coordinates the coordinates value to set.
	 */
	void setCoordinates(int[] coordinates);

	/**
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	void setGroupId(int groupId);

	/**
	 * Setter for the player field.
	 * @param player the player value to set.
	 */
	void setPlayer(IPlayerInfo player);

	/**
	 * Setter for the signup field.
	 * @param signup the signup value to set.
	 */
	void setSignup(LocationSignup signup);

	/**
	 * Setter for the signupFactionId field.
	 * @param signupFactionId the signupFactionId value to set.
	 */
	void setSignupFactionId(int signupFactionId);

	/**
	 * Setter for the locationUnitList field.
	 * @param locationUnitList the locationUnitList value to set.
	 */
	void setLocationUnitList(List<IUnitCount> locationUnitList);

	/**
	 * Setter for the mobileUnitList field.
	 * @param mobileUnitList the mobileUnitList value to set.
	 */
	void setMobileUnitList(List<IUnitCount> mobileUnitList);

	/**
	 * Setter for the actionExecutingList field.
	 * @param actionExecutingList the actionExecutingList value to set.
	 */
	void setActionExecutingList(List<IActionExecuting> actionExecutingList);

	/**
	 * Setter for the upkeepList field.
	 * @param upkeepList the upkeepList value to set.
	 */
	void setUpkeepList(List<IUnitCount> upkeepList);

	/**
	 * Setter for the mobileList field.
	 * @param mobileList the mobileList value to set.
	 */
	void setMobileList(List<IMobileInfo> mobileList);

	/**
	 * Setter for the previousId field.
	 * @param previousId the previousId value to set.
	 */
	void setPreviousId(int previousId);

	/**
	 * Setter for the nextId field.
	 * @param nextId the nextId value to set.
	 */
	void setNextId(int nextId);
}
