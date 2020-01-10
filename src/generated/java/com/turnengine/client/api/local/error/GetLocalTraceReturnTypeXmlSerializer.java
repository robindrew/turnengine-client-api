package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetLocalTraceReturnTypeXmlSerializer implements IXmlSerializer<ILocalTrace> {

	private String name;

	public GetLocalTraceReturnTypeXmlSerializer() {
		this("GetLocalTraceReturnType");
	}

	public GetLocalTraceReturnTypeXmlSerializer(String name) {
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
	public ILocalTrace readObject(IXmlReader reader) {
		return new LocalTraceXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocalTrace object) {
		new LocalTraceXmlSerializer(getName()).writeObject(writer, object);
	}
}
