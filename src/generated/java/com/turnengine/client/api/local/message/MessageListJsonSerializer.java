package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class MessageListJsonSerializer implements IJsonSerializer<IMessageList> {

	private String name;

	public MessageListJsonSerializer() {
		this("MessageList");
	}

	public MessageListJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMessageList object) {
		writer.openObject();
		writer.writeObject(object.getMessageList(), new ListSerializer<IMessage>(new MessageJsonSerializer()));
		writer.writeInt(object.getTotal());
		writer.closeObject();
	}
}
