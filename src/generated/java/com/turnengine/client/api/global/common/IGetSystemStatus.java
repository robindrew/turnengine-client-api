package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetSystemStatus extends IExecutableBean<ISystemStatus> {

	int SERIALIZATION_ID = 1203;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
