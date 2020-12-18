package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetGameDefinitionByHostPortXmlSerializer implements IXmlSerializer<IGetGameDefinitionByHostPort> {

	private String name;

	public GetGameDefinitionByHostPortXmlSerializer() {
		this("GetGameDefinitionByHostPort");
	}

	public GetGameDefinitionByHostPortXmlSerializer(String name) {
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
	public IGetGameDefinitionByHostPort readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		int param2 = reader.readInt("port");
		reader.endElement(getName());

		// Create the bean
		return new GetGameDefinitionByHostPort(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameDefinitionByHostPort object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("port", object.getPort());
		writer.endElement(getName());
	}
}
