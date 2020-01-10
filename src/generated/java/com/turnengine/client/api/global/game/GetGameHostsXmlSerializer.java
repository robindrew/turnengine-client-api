package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameHostsXmlSerializer implements IXmlSerializer<IGetGameHosts> {

	private String name;

	public GetGameHostsXmlSerializer() {
		this("GetGameHosts");
	}

	public GetGameHostsXmlSerializer(String name) {
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
	public IGetGameHosts readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetGameHosts();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameHosts object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
