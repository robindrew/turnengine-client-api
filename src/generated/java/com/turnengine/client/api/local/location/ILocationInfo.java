package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;
import com.turnengine.client.api.local.player.IPlayerInfo;

public interface ILocationInfo extends IBean, INamedIdentity, Comparable<ILocationInfo> {

	int SERIALIZATION_ID = 2827;

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
	 * Getter for the player field.
	 * @return the value of the player field.
	 */
	IPlayerInfo getPlayer();

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
	 * Setter for the player field.
	 * @param player the player value to set.
	 */
	void setPlayer(IPlayerInfo player);
}
