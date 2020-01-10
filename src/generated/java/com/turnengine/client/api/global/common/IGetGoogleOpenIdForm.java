package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGoogleOpenIdForm extends IExecutableBean<IOpenIdForm> {

	int SERIALIZATION_ID = 1210;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();
}
