package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class NewGameHostXmlSerializer implements IXmlSerializer<INewGameHost> {

	private String name;

	public NewGameHostXmlSerializer() {
		this("NewGameHost");
	}

	public NewGameHostXmlSerializer(String name) {
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
	public INewGameHost readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("port");
		reader.endElement(getName());

		// Create the bean
		return new NewGameHost(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, INewGameHost object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("port", object.getPort());
		writer.endElement(getName());
	}
}
