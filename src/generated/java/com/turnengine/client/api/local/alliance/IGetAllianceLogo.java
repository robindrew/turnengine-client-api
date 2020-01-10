package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.global.image.IImage;

public interface IGetAllianceLogo extends IExecutableBean<IImage>, ILocalLoggedInBean<IImage>, Comparable<IGetAllianceLogo> {

	int SERIALIZATION_ID = 5128;

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
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	int getInstanceId();

	/**
	 * Getter for the allianceId field.
	 * @return the value of the allianceId field.
	 */
	int getAllianceId();

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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

	/**
	 * Setter for the allianceId field.
	 * @param allianceId the allianceId value to set.
	 */
	void setAllianceId(int allianceId);

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
