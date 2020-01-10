package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetFactionByNameReturnTypeXmlSerializer implements IXmlSerializer<IFaction> {

	private String name;

	public GetFactionByNameReturnTypeXmlSerializer() {
		this("GetFactionByNameReturnType");
	}

	public GetFactionByNameReturnTypeXmlSerializer(String name) {
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
	public IFaction readObject(IXmlReader reader) {
		return new FactionXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IFaction object) {
		new FactionXmlSerializer(getName()).writeObject(writer, object);
	}
}
