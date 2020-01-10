package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IAnnouncement extends IBean, Comparable<IAnnouncement> {

	int SERIALIZATION_ID = 1105;

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
	 * Getter for the gameId field.
	 * @return the value of the gameId field.
	 */
	int getGameId();

	/**
	 * Getter for the gameName field.
	 * @return the value of the gameName field.
	 */
	String getGameName();

	/**
	 * Getter for the versionId field.
	 * @return the value of the versionId field.
	 */
	int getVersionId();

	/**
	 * Getter for the versionName field.
	 * @return the value of the versionName field.
	 */
	String getVersionName();

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	int getInstanceId();

	/**
	 * Getter for the instanceName field.
	 * @return the value of the instanceName field.
	 */
	String getInstanceName();

	/**
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	int getUserId();

	/**
	 * Getter for the userName field.
	 * @return the value of the userName field.
	 */
	String getUserName();

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	long getTimestamp();

	/**
	 * Getter for the subject field.
	 * @return the value of the subject field.
	 */
	String getSubject();

	/**
	 * Getter for the body field.
	 * @return the value of the body field.
	 */
	String getBody();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the gameId field.
	 * @param gameId the gameId value to set.
	 */
	void setGameId(int gameId);

	/**
	 * Setter for the gameName field.
	 * @param gameName the gameName value to set.
	 */
	void setGameName(String gameName);

	/**
	 * Setter for the versionId field.
	 * @param versionId the versionId value to set.
	 */
	void setVersionId(int versionId);

	/**
	 * Setter for the versionName field.
	 * @param versionName the versionName value to set.
	 */
	void setVersionName(String versionName);

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

	/**
	 * Setter for the instanceName field.
	 * @param instanceName the instanceName value to set.
	 */
	void setInstanceName(String instanceName);

	/**
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	void setUserId(int userId);

	/**
	 * Setter for the userName field.
	 * @param userName the userName value to set.
	 */
	void setUserName(String userName);

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	void setTimestamp(long timestamp);

	/**
	 * Setter for the subject field.
	 * @param subject the subject value to set.
	 */
	void setSubject(String subject);

	/**
	 * Setter for the body field.
	 * @param body the body value to set.
	 */
	void setBody(String body);
}
