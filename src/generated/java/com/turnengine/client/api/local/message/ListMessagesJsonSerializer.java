package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ListMessagesJsonSerializer implements IJsonSerializer<IListMessages> {

	private String name;

	public ListMessagesJsonSerializer() {
		this("ListMessages");
	}

	public ListMessagesJsonSerializer(String name) {
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
	public IListMessages readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IListMessages object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getType(), new EnumSerializer<MessageType>(MessageType.class));
		writer.writeBoolean(object.getIncludeContent());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getLocationId());
		writer.writeObject(object.getFormat(), new StringSerializer());
		writer.closeObject();
	}
}
