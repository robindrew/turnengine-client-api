package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameVersionByNameReturnTypeXmlSerializer implements IXmlSerializer<IGameVersion> {

	private String name;

	public GetGameVersionByNameReturnTypeXmlSerializer() {
		this("GetGameVersionByNameReturnType");
	}

	public GetGameVersionByNameReturnTypeXmlSerializer(String name) {
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
	public IGameVersion readObject(IXmlReader reader) {
		return new GameVersionXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameVersion object) {
		new GameVersionXmlSerializer(getName()).writeObject(writer, object);
	}
}
