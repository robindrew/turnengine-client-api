package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAllianceSetupInfoReturnTypeXmlSerializer implements IXmlSerializer<IAllianceSetupInfo> {

	private String name;

	public GetAllianceSetupInfoReturnTypeXmlSerializer() {
		this("GetAllianceSetupInfoReturnType");
	}

	public GetAllianceSetupInfoReturnTypeXmlSerializer(String name) {
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
	public IAllianceSetupInfo readObject(IXmlReader reader) {
		return new AllianceSetupInfoXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceSetupInfo object) {
		new AllianceSetupInfoXmlSerializer(getName()).writeObject(writer, object);
	}
}
