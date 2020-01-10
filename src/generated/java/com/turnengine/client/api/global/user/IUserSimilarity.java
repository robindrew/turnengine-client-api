package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IUserSimilarity extends IBean, Comparable<IUserSimilarity> {

	int SERIALIZATION_ID = 1735;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the user1 field.
	 * @return the value of the user1 field.
	 */
	IUser getUser1();

	/**
	 * Getter for the user2 field.
	 * @return the value of the user2 field.
	 */
	IUser getUser2();

	/**
	 * Getter for the nameScore field.
	 * @return the value of the nameScore field.
	 */
	int getNameScore();

	/**
	 * Getter for the emailScore field.
	 * @return the value of the emailScore field.
	 */
	int getEmailScore();

	/**
	 * Getter for the addressScore field.
	 * @return the value of the addressScore field.
	 */
	int getAddressScore();

	/**
	 * Getter for the passwordScore field.
	 * @return the value of the passwordScore field.
	 */
	int getPasswordScore();

	/**
	 * Setter for the user1 field.
	 * @param user1 the user1 value to set.
	 */
	void setUser1(IUser user1);

	/**
	 * Setter for the user2 field.
	 * @param user2 the user2 value to set.
	 */
	void setUser2(IUser user2);

	/**
	 * Setter for the nameScore field.
	 * @param nameScore the nameScore value to set.
	 */
	void setNameScore(int nameScore);

	/**
	 * Setter for the emailScore field.
	 * @param emailScore the emailScore value to set.
	 */
	void setEmailScore(int emailScore);

	/**
	 * Setter for the addressScore field.
	 * @param addressScore the addressScore value to set.
	 */
	void setAddressScore(int addressScore);

	/**
	 * Setter for the passwordScore field.
	 * @param passwordScore the passwordScore value to set.
	 */
	void setPasswordScore(int passwordScore);
}
