package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetSystemStatusReturnTypeXmlSerializer implements IXmlSerializer<ISystemStatus> {

	private String name;

	public GetSystemStatusReturnTypeXmlSerializer() {
		this("GetSystemStatusReturnType");
	}

	public GetSystemStatusReturnTypeXmlSerializer(String name) {
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
	public ISystemStatus readObject(IXmlReader reader) {
		return new SystemStatusXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISystemStatus object) {
		new SystemStatusXmlSerializer(getName()).writeObject(writer, object);
	}
}
