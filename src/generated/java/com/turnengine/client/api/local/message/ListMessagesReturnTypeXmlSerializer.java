package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ListMessagesReturnTypeXmlSerializer implements IXmlSerializer<IMessageList> {

	private String name;

	public ListMessagesReturnTypeXmlSerializer() {
		this("ListMessagesReturnType");
	}

	public ListMessagesReturnTypeXmlSerializer(String name) {
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
	public IMessageList readObject(IXmlReader reader) {
		return new MessageListXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMessageList object) {
		new MessageListXmlSerializer(getName()).writeObject(writer, object);
	}
}
