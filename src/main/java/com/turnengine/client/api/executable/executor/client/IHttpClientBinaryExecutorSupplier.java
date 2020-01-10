package com.turnengine.client.api.executable.executor.client;

import com.google.common.base.Supplier;
import com.robindrew.common.net.IHostPort;

public interface IHttpClientBinaryExecutorSupplier extends Supplier<IBinaryExecutor> {

	IHostPort getHostPort();

	void setHostPort(IHostPort host);
}
