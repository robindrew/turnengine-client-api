package com.turnengine.client.api.executable.executor.type;

import java.util.List;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.executable.bean.IExecutableBeanResponse;

public interface IContentTypeSerializer {

	SerializedContentType getContentType();

	byte[] writeBeans(List<IExecutableBean<?>> beans);

	byte[] writeResponses(List<IExecutableBeanResponse<?>> responses);

	List<IExecutableBean<?>> readBeans(byte[] bytes);

	List<IExecutableBeanResponse<?>> readResponses(byte[] bytes);

}
