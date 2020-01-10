package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.BooleanSerializer;

public class AddActionPluginReturnTypeXmlSerializer implements IXmlSerializer<Boolean> {

	private String name;

	public AddActionPluginReturnTypeXmlSerializer() {
		this("AddActionPluginReturnType");
	}

	public AddActionPluginReturnTypeXmlSerializer(String name) {
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
	public Boolean readObject(IXmlReader reader) {
		return new BooleanSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, Boolean object) {
		new BooleanSerializer(getName()).writeObject(writer, object);
	}
}
