package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameByIdXmlSerializer implements IXmlSerializer<IGetGameById> {

	private String name;

	public GetGameByIdXmlSerializer() {
		this("GetGameById");
	}

	public GetGameByIdXmlSerializer(String name) {
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
	public IGetGameById readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("gameId");
		reader.endElement(getName());

		// Create the bean
		return new GetGameById(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGameById object) {
		writer.startElement(getName());
		writer.writeInt("gameId", object.getGameId());
		writer.endElement(getName());
	}
}
