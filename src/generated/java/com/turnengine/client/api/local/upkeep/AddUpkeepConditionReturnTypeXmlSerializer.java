package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AddUpkeepConditionReturnTypeXmlSerializer implements IXmlSerializer<IUpkeepCondition> {

	private String name;

	public AddUpkeepConditionReturnTypeXmlSerializer() {
		this("AddUpkeepConditionReturnType");
	}

	public AddUpkeepConditionReturnTypeXmlSerializer(String name) {
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
	public IUpkeepCondition readObject(IXmlReader reader) {
		return new UpkeepConditionXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUpkeepCondition object) {
		new UpkeepConditionXmlSerializer(getName()).writeObject(writer, object);
	}
}
