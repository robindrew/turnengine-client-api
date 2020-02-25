package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;

public interface IFaction extends IBean, INamedIdentity, Comparable<IFaction> {

	int SERIALIZATION_ID = 2505;

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
	 * Getter for the password field.
	 * @return the value of the password field.
	 */
	String getPassword();

	/**
	 * Getter for the united field.
	 * @return the value of the united field.
	 */
	FactionUnited getUnited();

	/**
	 * Getter for the playerLimit field.
	 * @return the value of the playerLimit field.
	 */
	int getPlayerLimit();

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
	 * Setter for the password field.
	 * @param password the password value to set.
	 */
	void setPassword(String password);

	/**
	 * Setter for the united field.
	 * @param united the united value to set.
	 */
	void setUnited(FactionUnited united);

	/**
	 * Setter for the playerLimit field.
	 * @param playerLimit the playerLimit value to set.
	 */
	void setPlayerLimit(int playerLimit);
}
