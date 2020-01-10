package com.turnengine.client.api.executable.executor.client;

import static org.apache.http.impl.client.HttpClients.createDefault;

import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;

import com.robindrew.common.net.IHostPort;
import com.robindrew.common.util.Check;

public class HttpClientBinaryExecutorSupplier implements IHttpClientBinaryExecutorSupplier {

	private volatile IHostPort hostPort;

	public HttpClientBinaryExecutorSupplier(IHostPort hostPort) {
		setHostPort(hostPort);
	}

	@Override
	public IHostPort getHostPort() {
		return hostPort;
	}

	@Override
	public void setHostPort(IHostPort hostPort) {
		this.hostPort = Check.notNull("hostPort", hostPort);
	}

	@Override
	public HttpClientBinaryExecutor get() {
		CloseableHttpClient client = createDefault();
		HttpHost host = new HttpHost(hostPort.getHost(), hostPort.getPort());
		return new HttpClientBinaryExecutor(client, host, "/BeanExecutorService");
	}

}
