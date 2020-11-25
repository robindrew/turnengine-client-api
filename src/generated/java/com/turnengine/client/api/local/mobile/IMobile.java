package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.turnengine.client.api.local.action.IActionExecuting;
import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface IMobile extends IBean, INamedIdentity, Comparable<IMobile> {

	int SERIALIZATION_ID = 3029;

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
	 * Getter for the player field.
	 * @return the value of the player field.
	 */
	IPlayerInfo getPlayer();

	/**
	 * Getter for the origin field.
	 * @return the value of the origin field.
	 */
	ILocationInfo getOrigin();

	/**
	 * Getter for the destination field.
	 * @return the value of the destination field.
	 */
	ILocationInfo getDestination();

	/**
	 * Getter for the moveTurns field.
	 * @return the value of the moveTurns field.
	 */
	int getMoveTurns();

	/**
	 * Getter for the waitTurns field.
	 * @return the value of the waitTurns field.
	 */
	int getWaitTurns();

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	List<IUnitCount> getUnitList();

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
	 * Setter for the player field.
	 * @param player the player value to set.
	 */
	void setPlayer(IPlayerInfo player);

	/**
	 * Setter for the origin field.
	 * @param origin the origin value to set.
	 */
	void setOrigin(ILocationInfo origin);

	/**
	 * Setter for the destination field.
	 * @param destination the destination value to set.
	 */
	void setDestination(ILocationInfo destination);

	/**
	 * Setter for the moveTurns field.
	 * @param moveTurns the moveTurns value to set.
	 */
	void setMoveTurns(int moveTurns);

	/**
	 * Setter for the waitTurns field.
	 * @param waitTurns the waitTurns value to set.
	 */
	void setWaitTurns(int waitTurns);

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	void setUnitList(List<IUnitCount> unitList);

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
