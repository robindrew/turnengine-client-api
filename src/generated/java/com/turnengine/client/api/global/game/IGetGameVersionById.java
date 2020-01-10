package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGameVersionById extends IExecutableBean<IGameVersion>, Comparable<IGetGameVersionById> {

	int SERIALIZATION_ID = 1506;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the versionId field.
	 * @return the value of the versionId field.
	 */
	int getVersionId();

	/**
	 * Setter for the versionId field.
	 * @param versionId the versionId value to set.
	 */
	void setVersionId(int versionId);
}
