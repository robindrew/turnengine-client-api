package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetServiceStatusReturnTypeXmlSerializer implements IXmlSerializer<IServiceStatus> {

	private String name;

	public GetServiceStatusReturnTypeXmlSerializer() {
		this("GetServiceStatusReturnType");
	}

	public GetServiceStatusReturnTypeXmlSerializer(String name) {
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
	public IServiceStatus readObject(IXmlReader reader) {
		return new ServiceStatusXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IServiceStatus object) {
		new ServiceStatusXmlSerializer(getName()).writeObject(writer, object);
	}
}
