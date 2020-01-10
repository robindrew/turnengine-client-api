package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetServiceStatus extends IExecutableBean<IServiceStatus> {

	int SERIALIZATION_ID = 1202;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
