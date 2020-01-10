package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AddActionConditionReturnTypeXmlSerializer implements IXmlSerializer<IActionCondition> {

	private String name;

	public AddActionConditionReturnTypeXmlSerializer() {
		this("AddActionConditionReturnType");
	}

	public AddActionConditionReturnTypeXmlSerializer(String name) {
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
	public IActionCondition readObject(IXmlReader reader) {
		return new ActionConditionXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IActionCondition object) {
		new ActionConditionXmlSerializer(getName()).writeObject(writer, object);
	}
}
