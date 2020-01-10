package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetMessageSummaryReturnTypeXmlSerializer implements IXmlSerializer<IMessageSummary> {

	private String name;

	public GetMessageSummaryReturnTypeXmlSerializer() {
		this("GetMessageSummaryReturnType");
	}

	public GetMessageSummaryReturnTypeXmlSerializer(String name) {
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
	public IMessageSummary readObject(IXmlReader reader) {
		return new MessageSummaryXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMessageSummary object) {
		new MessageSummaryXmlSerializer(getName()).writeObject(writer, object);
	}
}
