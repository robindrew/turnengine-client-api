package com.turnengine.client.api.executable.executor.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.executable.bean.IExecutableBeanResponse;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorService;
import com.robindrew.common.util.Check;
import com.turnengine.client.api.executable.executor.client.IBinaryExecutor;
import com.turnengine.client.api.executable.executor.type.IContentTypeSerializer;
import com.turnengine.client.api.executable.executor.type.SerializedContentType;

public class ServerBinaryExecutor implements IBinaryExecutor {

	private final IBeanExecutorService executor;
	private final EnumMap<SerializedContentType, IContentTypeSerializer> typeToSerializerMap = new EnumMap<>(SerializedContentType.class);

	public ServerBinaryExecutor(IBeanExecutorService executor, Collection<? extends IContentTypeSerializer> serializers) {
		this.executor = Check.notNull("executor", executor);
		Check.notEmpty("serializers", serializers);
		for (IContentTypeSerializer serializer : serializers) {
			typeToSerializerMap.put(serializer.getContentType(), serializer);
		}
	}

	@Override
	public byte[] execute(byte[] requestBytes, SerializedContentType type) {

		// Lookup the executor
		IContentTypeSerializer serializer = typeToSerializerMap.get(type);
		if (serializer == null) {
			throw new IllegalStateException("Type not supported: " + type);
		}

		// Deserialise the beans
		List<IExecutableBean<?>> beans = serializer.readBeans(requestBytes);
		if (beans.isEmpty()) {
			throw new IllegalArgumentException("No beans specified in request!");
		}

		// Execute the beans!
		Map<IExecutableBean<?>, IExecutableBeanResponse<?>> beanToResponseMap = executor.executeBeanList(beans);

		// Serialise the responses
		List<IExecutableBeanResponse<?>> responses = new ArrayList<>(beanToResponseMap.values());
		byte[] responseBytes = serializer.writeResponses(responses);

		// Success!
		return responseBytes;
	}

	@Override
	public void close() {
		// Nothing to do ...
	}

}
