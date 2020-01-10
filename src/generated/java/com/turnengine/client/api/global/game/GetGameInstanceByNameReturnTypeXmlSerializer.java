package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameInstanceByNameReturnTypeXmlSerializer implements IXmlSerializer<IGameInstance> {

	private String name;

	public GetGameInstanceByNameReturnTypeXmlSerializer() {
		this("GetGameInstanceByNameReturnType");
	}

	public GetGameInstanceByNameReturnTypeXmlSerializer(String name) {
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
	public IGameInstance readObject(IXmlReader reader) {
		return new GameInstanceXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameInstance object) {
		new GameInstanceXmlSerializer(getName()).writeObject(writer, object);
	}
}
