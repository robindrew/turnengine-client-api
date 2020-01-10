package com.turnengine.client.api.executable.executor;

import static com.robindrew.common.http.MimeType.APPLICATION_JSON;
import static com.robindrew.common.http.MimeType.TEXT_XML;

import com.robindrew.common.http.MimeType;
import com.turnengine.client.api.executable.executor.type.SerializedContentType;

public class HttpContentType {

	public static final MimeType APPLICATION_TURNENGINE_DATA = new MimeType("application/turnengine-data", false);

	public static String getContentType(SerializedContentType type) {
		return getMimeType(type).getType();
	}

	public static MimeType getMimeType(SerializedContentType type) {
		switch (type) {
			case XML:
				return TEXT_XML;
			case JSON:
				return APPLICATION_JSON;
			case DATA:
				return APPLICATION_TURNENGINE_DATA;
			default:
				throw new IllegalArgumentException("Type not supported: " + type);
		}
	}

	public static SerializedContentType parseContentType(String contentType) {
		int colon = contentType.indexOf(';');
		if (colon != -1) {
			contentType = contentType.substring(0, colon);
		}
		contentType = contentType.trim();
		if (contentType.equals(TEXT_XML.getType())) {
			return SerializedContentType.XML;
		}
		if (contentType.equals(APPLICATION_JSON.getType())) {
			return SerializedContentType.JSON;
		}
		if (contentType.equals(APPLICATION_TURNENGINE_DATA.getType())) {
			return SerializedContentType.DATA;
		}
		throw new IllegalArgumentException("contentType: '" + contentType + "'");
	}

}
