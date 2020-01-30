package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGameUnitsReturnTypeXmlSerializer implements IXmlSerializer<IGameUnits> {

	private String name;

	public GetGameUnitsReturnTypeXmlSerializer() {
		this("GetGameUnitsReturnType");
	}

	public GetGameUnitsReturnTypeXmlSerializer(String name) {
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
	public IGameUnits readObject(IXmlReader reader) {
		return new GameUnitsXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGameUnits object) {
		new GameUnitsXmlSerializer(getName()).writeObject(writer, object);
	}
}
