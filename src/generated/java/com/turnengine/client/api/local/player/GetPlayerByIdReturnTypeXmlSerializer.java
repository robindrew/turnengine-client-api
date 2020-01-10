package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetPlayerByIdReturnTypeXmlSerializer implements IXmlSerializer<IPlayer> {

	private String name;

	public GetPlayerByIdReturnTypeXmlSerializer() {
		this("GetPlayerByIdReturnType");
	}

	public GetPlayerByIdReturnTypeXmlSerializer(String name) {
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
	public IPlayer readObject(IXmlReader reader) {
		return new PlayerXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayer object) {
		new PlayerXmlSerializer(getName()).writeObject(writer, object);
	}
}
