package com.turnengine.client.api.executable.executor.client;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Supplier;
import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.codegenerator.api.executable.bean.IExecutableBeanResponse;
import com.robindrew.codegenerator.api.executable.executor.service.BatchBeanExecutorService;
import com.robindrew.common.util.Check;
import com.robindrew.common.util.Java;
import com.turnengine.client.api.executable.executor.type.IContentTypeSerializer;

/**
 * A client service which executes a list of beans, proving a map of responses.
 */
public class ClientBinaryBeanExecutorService extends BatchBeanExecutorService {

	private final Supplier<IBinaryExecutor> connections;
	private final IContentTypeSerializer serializer;

	public ClientBinaryBeanExecutorService(Supplier<IBinaryExecutor> connections, IContentTypeSerializer serializer) {
		this.connections = Check.notNull("connections", connections);
		this.serializer = Check.notNull("serializer", serializer);
	}

	@Override
	public Map<IExecutableBean<?>, IExecutableBeanResponse<?>> executeBeanList(List<IExecutableBean<?>> beanList) {
		if (beanList.isEmpty()) {
			throw new IllegalArgumentException("beans is empty");
		}

		try (IBinaryExecutor connection = connections.get()) {

			// Serialise the beans for execution
			byte[] request = serializer.writeBeans(beanList);

			// Send the request
			byte[] response = connection.execute(request, serializer.getContentType());

			// Receive the bean response from the server
			List<IExecutableBeanResponse<?>> responseList = serializer.readResponses(response);

			// Build the bean response map
			return toMap(beanList, responseList);

		} catch (Exception e) {
			throw Java.propagate(e);
		}
	}

	private Map<IExecutableBean<?>, IExecutableBeanResponse<?>> toMap(List<IExecutableBean<?>> beanList, List<IExecutableBeanResponse<?>> responseList) {
		Map<IExecutableBean<?>, IExecutableBeanResponse<?>> beanToResponseMap = new LinkedHashMap<>();
		for (int i = 0; i < beanList.size(); i++) {
			IExecutableBean<?> bean = beanList.get(i);
			IExecutableBeanResponse<?> response = responseList.get(i);
			beanToResponseMap.put(bean, response);
		}
		return beanToResponseMap;
	}

}
