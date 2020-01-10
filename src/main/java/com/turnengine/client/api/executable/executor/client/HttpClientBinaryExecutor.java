package com.turnengine.client.api.executable.executor.client;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.io.ByteStreams;
import com.robindrew.common.util.Check;
import com.turnengine.client.api.executable.executor.HttpContentType;
import com.turnengine.client.api.executable.executor.type.SerializedContentType;

public class HttpClientBinaryExecutor implements IBinaryExecutor {

	private static final Logger log = LoggerFactory.getLogger(HttpClientBinaryExecutor.class);

	private final CloseableHttpClient client;
	private final HttpHost host;
	private final String url;

	public HttpClientBinaryExecutor(CloseableHttpClient client, HttpHost host, String url) {
		this.client = Check.notNull("client", client);
		this.host = Check.notNull("host", host);
		this.url = Check.notEmpty("url", url);
	}

	@Override
	public byte[] execute(byte[] requestBytes, SerializedContentType type) {
		Check.notEmpty("requestBytes", requestBytes);
		Check.notNull("type", type);

		try {
			String contentType = HttpContentType.getContentType(type);

			// Create the HTTP POST request
			HttpPost request = new HttpPost(url);
			request.addHeader("Content-Type", contentType);
			request.setEntity(new ByteArrayEntity(requestBytes));

			// Execute the HTTP request
			log.debug("Sending HTTP request to URL: {} ({} bytes) with content type: {}", url, requestBytes.length, contentType);
			HttpResponse response = client.execute(host, request);

			// Check the HTTP response status
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != 200) {
				throw new IOException("Received unexpected response from server: " + response.getStatusLine());
			}

			// Read the HTTP response content
			InputStream input = response.getEntity().getContent();
			byte[] responseBytes = ByteStreams.toByteArray(input);
			log.debug("Received HTTP request from URL: {} ({} bytes) with content type: {}", url, responseBytes.length, contentType);
			return responseBytes;

		} catch (Exception e) {
			throw new RuntimeException("Exception thrown executing HTTP request on " + host, e);
		}
	}

	@Override
	public void close() {
		try {
			client.close();
		} catch (Exception e) {
			log.warn("Failed to close HTTP client", e);
		}
	}

}
