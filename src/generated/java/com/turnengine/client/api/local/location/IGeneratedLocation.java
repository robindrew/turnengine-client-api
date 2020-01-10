package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface IGeneratedLocation extends IBean, Comparable<IGeneratedLocation> {

	int SERIALIZATION_ID = 5711;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

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
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	List<IUnitCount> getUnitList();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

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
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	void setUnitList(List<IUnitCount> unitList);
}
