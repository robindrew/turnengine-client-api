package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AddActionReturnTypeXmlSerializer implements IXmlSerializer<IAction> {

	private String name;

	public AddActionReturnTypeXmlSerializer() {
		this("AddActionReturnType");
	}

	public AddActionReturnTypeXmlSerializer(String name) {
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
	public IAction readObject(IXmlReader reader) {
		return new ActionXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAction object) {
		new ActionXmlSerializer(getName()).writeObject(writer, object);
	}
}
