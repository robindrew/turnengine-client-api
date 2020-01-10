package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AddActionTargetReturnTypeXmlSerializer implements IXmlSerializer<IActionTarget> {

	private String name;

	public AddActionTargetReturnTypeXmlSerializer() {
		this("AddActionTargetReturnType");
	}

	public AddActionTargetReturnTypeXmlSerializer(String name) {
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
	public IActionTarget readObject(IXmlReader reader) {
		return new ActionTargetXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IActionTarget object) {
		new ActionTargetXmlSerializer(getName()).writeObject(writer, object);
	}
}
