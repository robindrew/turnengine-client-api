package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameVersionsXmlSerializer implements IXmlSerializer<IGetGameVersions> {

	private String name;

	public GetGameVersionsXmlSerializer() {
		this("GetGameVersions");
	}

	public GetGameVersionsXmlSerializer(String name) {
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
	public IGetGameVersions readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetGameVersions();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameVersions object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
