package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetPlayerSetupInfoReturnTypeXmlSerializer implements IXmlSerializer<IPlayerSetupInfo> {

	private String name;

	public GetPlayerSetupInfoReturnTypeXmlSerializer() {
		this("GetPlayerSetupInfoReturnType");
	}

	public GetPlayerSetupInfoReturnTypeXmlSerializer(String name) {
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
	public IPlayerSetupInfo readObject(IXmlReader reader) {
		return new PlayerSetupInfoXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayerSetupInfo object) {
		new PlayerSetupInfoXmlSerializer(getName()).writeObject(writer, object);
	}
}
