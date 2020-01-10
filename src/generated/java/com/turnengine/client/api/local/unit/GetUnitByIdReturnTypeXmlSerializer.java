package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUnitByIdReturnTypeXmlSerializer implements IXmlSerializer<IUnit> {

	private String name;

	public GetUnitByIdReturnTypeXmlSerializer() {
		this("GetUnitByIdReturnType");
	}

	public GetUnitByIdReturnTypeXmlSerializer(String name) {
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
	public IUnit readObject(IXmlReader reader) {
		return new UnitXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUnit object) {
		new UnitXmlSerializer(getName()).writeObject(writer, object);
	}
}
