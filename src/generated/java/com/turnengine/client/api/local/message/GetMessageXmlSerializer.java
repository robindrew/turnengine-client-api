package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetMessageXmlSerializer implements IXmlSerializer<IGetMessage> {

	private String name;

	public GetMessageXmlSerializer() {
		this("GetMessage");
	}

	public GetMessageXmlSerializer(String name) {
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
	public IGetMessage readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("messageId");
		reader.endElement(getName());

		// Create the bean
		return new GetMessage(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetMessage object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("messageId", object.getMessageId());
		writer.endElement(getName());
	}
}
