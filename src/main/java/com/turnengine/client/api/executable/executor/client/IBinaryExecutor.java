package com.turnengine.client.api.executable.executor.client;

import com.turnengine.client.api.executable.executor.type.SerializedContentType;

public interface IBinaryExecutor extends AutoCloseable {

	byte[] execute(byte[] requestBytes, SerializedContentType type);

	@Override
	void close();
}
