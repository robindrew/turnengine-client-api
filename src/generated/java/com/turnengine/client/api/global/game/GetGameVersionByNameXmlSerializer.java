package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetGameVersionByNameXmlSerializer implements IXmlSerializer<IGetGameVersionByName> {

	private String name;

	public GetGameVersionByNameXmlSerializer() {
		this("GetGameVersionByName");
	}

	public GetGameVersionByNameXmlSerializer(String name) {
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
	public IGetGameVersionByName readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("versionName"));
		int param2 = reader.readInt("gameId");
		reader.endElement(getName());

		// Create the bean
		return new GetGameVersionByName(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameVersionByName object) {
		writer.startElement(getName());
		writer.writeObject(object.getVersionName(), new StringSerializer("versionName"));
		writer.writeInt("gameId", object.getGameId());
		writer.endElement(getName());
	}
}
