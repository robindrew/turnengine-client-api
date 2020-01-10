package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAllianceInfoReturnTypeXmlSerializer implements IXmlSerializer<IAllianceInfo> {

	private String name;

	public GetAllianceInfoReturnTypeXmlSerializer() {
		this("GetAllianceInfoReturnType");
	}

	public GetAllianceInfoReturnTypeXmlSerializer(String name) {
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
	public IAllianceInfo readObject(IXmlReader reader) {
		return new AllianceInfoXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceInfo object) {
		new AllianceInfoXmlSerializer(getName()).writeObject(writer, object);
	}
}
