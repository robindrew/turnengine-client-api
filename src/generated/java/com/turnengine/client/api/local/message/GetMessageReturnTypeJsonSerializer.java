package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetMessageReturnTypeJsonSerializer implements IJsonSerializer<IMessage> {

	private String name;

	public GetMessageReturnTypeJsonSerializer() {
		this("GetMessageReturnType");
	}

	public GetMessageReturnTypeJsonSerializer(String name) {
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
	public IMessage readObject(IJsonReader reader) {
		return new MessageJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IMessage object) {
		new MessageJsonSerializer().writeObject(writer, object);
	}
}
