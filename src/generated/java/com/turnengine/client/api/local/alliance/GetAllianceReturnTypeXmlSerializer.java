package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAllianceReturnTypeXmlSerializer implements IXmlSerializer<IAlliance> {

	private String name;

	public GetAllianceReturnTypeXmlSerializer() {
		this("GetAllianceReturnType");
	}

	public GetAllianceReturnTypeXmlSerializer(String name) {
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
	public IAlliance readObject(IXmlReader reader) {
		return new AllianceXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAlliance object) {
		new AllianceXmlSerializer(getName()).writeObject(writer, object);
	}
}
