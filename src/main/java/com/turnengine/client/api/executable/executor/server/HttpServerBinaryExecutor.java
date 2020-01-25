package com.turnengine.client.api.executable.executor.server;

import static com.google.common.io.ByteStreams.readFully;
import static com.turnengine.client.api.executable.executor.HttpContentType.parseContentType;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.io.ByteStreams;
import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorService;
import com.robindrew.common.http.servlet.request.IHttpRequest;
import com.robindrew.common.http.servlet.response.IHttpResponse;
import com.robindrew.common.util.Java;
import com.turnengine.client.api.executable.executor.type.IContentTypeSerializer;
import com.turnengine.client.api.executable.executor.type.SerializedContentType;

public class HttpServerBinaryExecutor extends ServerBinaryExecutor implements IHttpServerBinaryExecutor {

	private static final Logger log = LoggerFactory.getLogger(HttpServerBinaryExecutor.class);

	public HttpServerBinaryExecutor(IBeanExecutorService executor, Collection<? extends IContentTypeSerializer> serializers) {
		super(executor, serializers);
	}

	@Override
	public void execute(IHttpRequest request, IHttpResponse response) {
		try {

			// Lookup the content type
			String contentType = request.getContentType();
			SerializedContentType type = parseContentType(contentType);

			// Read the request content
			byte[] requestBytes = readContent(request);

			// Execute the request
			byte[] responseBytes = execute(requestBytes, type);

			// Prepare the response
			response.setStatus(200);
			response.setContentLength(responseBytes.length);
			response.setContentType(contentType);

			// Write the response content
			writeContent(response, responseBytes);

		} catch (Exception e) {
			log.warn("Error serving binary HTTP content", e);
			throw Java.propagate(e);
		}
	}

	private void writeContent(IHttpResponse response, byte[] responseBytes) throws IOException {
		ServletOutputStream output = response.getOutputStream();
		output.write(responseBytes);
		output.flush();
	}

	private byte[] readContent(IHttpRequest request) {
		int length = request.getContentLength();
		if (length == 0) {
			throw new IllegalArgumentException("HTTP request has empty content!");
		}
		try {
			if (length == -1) {
				ByteArrayOutputStream content = new ByteArrayOutputStream();
				ByteStreams.copy(request.getInputStream(), content);
				return content.toByteArray();
			}

			byte[] content = new byte[length];
			readFully(request.getInputStream(), content, 0, length);
			return content;
		} catch (IOException e) {
			throw Java.propagate(e);
		}
	}

}
