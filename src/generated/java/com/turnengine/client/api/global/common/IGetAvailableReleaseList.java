package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import java.util.List;

public interface IGetAvailableReleaseList extends IExecutableBean<List<IReleaseInfo>>, Comparable<IGetAvailableReleaseList> {

	int SERIALIZATION_ID = 1208;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the project field.
	 * @return the value of the project field.
	 */
	String getProject();

	/**
	 * Setter for the project field.
	 * @param project the project value to set.
	 */
	void setProject(String project);
}
