package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameDefinitionXmlSerializer implements IXmlSerializer<IGetGameDefinition> {

	private String name;

	public GetGameDefinitionXmlSerializer() {
		this("GetGameDefinition");
	}

	public GetGameDefinitionXmlSerializer(String name) {
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
	public IGetGameDefinition readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("instanceId");
		reader.endElement(getName());

		// Create the bean
		return new GetGameDefinition(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameDefinition object) {
		writer.startElement(getName());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.endElement(getName());
	}
}
