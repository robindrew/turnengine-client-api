package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetMessageReturnTypeXmlSerializer implements IXmlSerializer<IMessage> {

	private String name;

	public GetMessageReturnTypeXmlSerializer() {
		this("GetMessageReturnType");
	}

	public GetMessageReturnTypeXmlSerializer(String name) {
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
	public IMessage readObject(IXmlReader reader) {
		return new MessageXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMessage object) {
		new MessageXmlSerializer(getName()).writeObject(writer, object);
	}
}
