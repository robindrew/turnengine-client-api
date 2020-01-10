package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetGameHostByNameXmlSerializer implements IXmlSerializer<IGetGameHostByName> {

	private String name;

	public GetGameHostByNameXmlSerializer() {
		this("GetGameHostByName");
	}

	public GetGameHostByNameXmlSerializer(String name) {
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
	public IGetGameHostByName readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		int param2 = reader.readInt("port");
		reader.endElement(getName());

		// Create the bean
		return new GetGameHostByName(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameHostByName object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("port", object.getPort());
		writer.endElement(getName());
	}
}
