package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AddUpkeepReturnTypeXmlSerializer implements IXmlSerializer<IUpkeep> {

	private String name;

	public AddUpkeepReturnTypeXmlSerializer() {
		this("AddUpkeepReturnType");
	}

	public AddUpkeepReturnTypeXmlSerializer(String name) {
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
	public IUpkeep readObject(IXmlReader reader) {
		return new UpkeepXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUpkeep object) {
		new UpkeepXmlSerializer(getName()).writeObject(writer, object);
	}
}
