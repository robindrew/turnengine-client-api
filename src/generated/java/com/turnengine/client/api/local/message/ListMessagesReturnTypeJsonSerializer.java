package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ListMessagesReturnTypeJsonSerializer implements IJsonSerializer<IMessageList> {

	private String name;

	public ListMessagesReturnTypeJsonSerializer() {
		this("ListMessagesReturnType");
	}

	public ListMessagesReturnTypeJsonSerializer(String name) {
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
	public IMessageList readObject(IJsonReader reader) {
		return new MessageListJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IMessageList object) {
		new MessageListJsonSerializer().writeObject(writer, object);
	}
}
