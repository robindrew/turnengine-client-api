package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import com.turnengine.client.api.global.game.GameLevel;

public interface ISetUserGamePermission extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISetUserGamePermission> {

	int SERIALIZATION_ID = 1715;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	long getLoginId();

	/**
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	int getUserId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	int getId();

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	UserPermissionType getType();

	/**
	 * Getter for the level field.
	 * @return the value of the level field.
	 */
	GameLevel getLevel();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	void setUserId(int userId);

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(UserPermissionType type);

	/**
	 * Setter for the level field.
	 * @param level the level value to set.
	 */
	void setLevel(GameLevel level);
}
