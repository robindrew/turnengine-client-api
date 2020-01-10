package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetLoggedExceptionsReturnTypeJsonSerializer implements IJsonSerializer<List<ILoggedException>> {

	private String name;

	public GetLoggedExceptionsReturnTypeJsonSerializer() {
		this("GetLoggedExceptionsReturnType");
	}

	public GetLoggedExceptionsReturnTypeJsonSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public List<ILoggedException> readObject(IJsonReader reader) {
		return new ListSerializer<ILoggedException>(new LoggedExceptionJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<ILoggedException> object) {
		new ListSerializer<ILoggedException>(new LoggedExceptionJsonSerializer()).writeObject(writer, object);
	}
}
