package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AddUnitsAtMobileXmlSerializer implements IXmlSerializer<IAddUnitsAtMobile> {

	private String name;

	public AddUnitsAtMobileXmlSerializer() {
		this("AddUnitsAtMobile");
	}

	public AddUnitsAtMobileXmlSerializer(String name) {
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
	public IAddUnitsAtMobile readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		int param4 = reader.readInt("unitId");
		long param5 = reader.readLong("amount");
		reader.endElement(getName());

		// Create the bean
		return new AddUnitsAtMobile(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddUnitsAtMobile object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeInt("unitId", object.getUnitId());
		writer.writeLong("amount", object.getAmount());
		writer.endElement(getName());
	}
}
