package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameInstancesXmlSerializer implements IXmlSerializer<IGetGameInstances> {

	private String name;

	public GetGameInstancesXmlSerializer() {
		this("GetGameInstances");
	}

	public GetGameInstancesXmlSerializer(String name) {
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
	public IGetGameInstances readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetGameInstances();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameInstances object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
