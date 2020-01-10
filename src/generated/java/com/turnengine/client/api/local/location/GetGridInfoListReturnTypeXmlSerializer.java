package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGridInfoListReturnTypeXmlSerializer implements IXmlSerializer<IGridInfo> {

	private String name;

	public GetGridInfoListReturnTypeXmlSerializer() {
		this("GetGridInfoListReturnType");
	}

	public GetGridInfoListReturnTypeXmlSerializer(String name) {
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
	public IGridInfo readObject(IXmlReader reader) {
		return new GridInfoXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGridInfo object) {
		new GridInfoXmlSerializer(getName()).writeObject(writer, object);
	}
}
