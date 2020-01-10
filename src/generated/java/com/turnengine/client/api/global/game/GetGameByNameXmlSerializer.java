package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetGameByNameXmlSerializer implements IXmlSerializer<IGetGameByName> {

	private String name;

	public GetGameByNameXmlSerializer() {
		this("GetGameByName");
	}

	public GetGameByNameXmlSerializer(String name) {
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
	public IGetGameByName readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("gameName"));
		reader.endElement(getName());

		// Create the bean
		return new GetGameByName(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameByName object) {
		writer.startElement(getName());
		writer.writeObject(object.getGameName(), new StringSerializer("gameName"));
		writer.endElement(getName());
	}
}
