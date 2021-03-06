package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class StartActionMovementReturnTypeXmlSerializer implements IXmlSerializer<IActionStatus> {

	private String name;

	public StartActionMovementReturnTypeXmlSerializer() {
		this("StartActionMovementReturnType");
	}

	public StartActionMovementReturnTypeXmlSerializer(String name) {
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
	public IActionStatus readObject(IXmlReader reader) {
		return new ActionStatusXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IActionStatus object) {
		new ActionStatusXmlSerializer(getName()).writeObject(writer, object);
	}
}
