package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalExecutableBean;
import com.turnengine.client.api.global.image.IImage;

public interface IGetUserAvatar extends IExecutableBean<IImage>, IGlobalExecutableBean<IImage>, Comparable<IGetUserAvatar> {

	int SERIALIZATION_ID = 1728;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	int getUserId();

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
	 * Getter for the fill field.
	 * @return the value of the fill field.
	 */
	boolean getFill();

	/**
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	void setUserId(int userId);

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
	 * Setter for the fill field.
	 * @param fill the fill value to set.
	 */
	void setFill(boolean fill);
}
