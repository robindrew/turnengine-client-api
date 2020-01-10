package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ListMessagesXmlSerializer implements IXmlSerializer<IListMessages> {

	private String name;

	public ListMessagesXmlSerializer() {
		this("ListMessages");
	}

	public ListMessagesXmlSerializer(String name) {
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
	public IListMessages readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		MessageType param3 = reader.readObject(new EnumSerializer<MessageType>(MessageType.class, "type"));
		boolean param4 = reader.readBoolean("includeContent");
		int param5 = reader.readInt("pageNumber");
		int param6 = reader.readInt("pageSize");
		int param7 = reader.readInt("mobileId");
		int param8 = reader.readInt("locationId");
		String param9 = reader.readObject(new StringSerializer("format"));
		reader.endElement(getName());

		// Create the bean
		return new ListMessages(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeObject(IXmlWriter writer, IListMessages object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getType(), new EnumSerializer<MessageType>(MessageType.class, "type"));
		writer.writeBoolean("includeContent", object.getIncludeContent());
		writer.writeInt("pageNumber", object.getPageNumber());
		writer.writeInt("pageSize", object.getPageSize());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeObject(object.getFormat(), new StringSerializer("format"));
		writer.endElement(getName());
	}
}
