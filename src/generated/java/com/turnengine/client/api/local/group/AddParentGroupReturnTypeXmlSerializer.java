package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AddParentGroupReturnTypeXmlSerializer implements IXmlSerializer<IGroup> {

	private String name;

	public AddParentGroupReturnTypeXmlSerializer() {
		this("AddParentGroupReturnType");
	}

	public AddParentGroupReturnTypeXmlSerializer(String name) {
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
	public IGroup readObject(IXmlReader reader) {
		return new GroupXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGroup object) {
		new GroupXmlSerializer(getName()).writeObject(writer, object);
	}
}
