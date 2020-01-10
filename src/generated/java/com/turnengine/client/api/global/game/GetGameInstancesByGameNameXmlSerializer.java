package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetGameInstancesByGameNameXmlSerializer implements IXmlSerializer<IGetGameInstancesByGameName> {

	private String name;

	public GetGameInstancesByGameNameXmlSerializer() {
		this("GetGameInstancesByGameName");
	}

	public GetGameInstancesByGameNameXmlSerializer(String name) {
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
	public IGetGameInstancesByGameName readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("gameName"));
		reader.endElement(getName());

		// Create the bean
		return new GetGameInstancesByGameName(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameInstancesByGameName object) {
		writer.startElement(getName());
		writer.writeObject(object.getGameName(), new StringSerializer("gameName"));
		writer.endElement(getName());
	}
}
