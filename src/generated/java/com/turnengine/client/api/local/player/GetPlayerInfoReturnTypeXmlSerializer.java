package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetPlayerInfoReturnTypeXmlSerializer implements IXmlSerializer<IPlayerInfo> {

	private String name;

	public GetPlayerInfoReturnTypeXmlSerializer() {
		this("GetPlayerInfoReturnType");
	}

	public GetPlayerInfoReturnTypeXmlSerializer(String name) {
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
	public IPlayerInfo readObject(IXmlReader reader) {
		return new PlayerInfoXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayerInfo object) {
		new PlayerInfoXmlSerializer(getName()).writeObject(writer, object);
	}
}
