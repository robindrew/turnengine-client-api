package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetUnitsByFactionIdReturnTypeXmlSerializer implements IXmlSerializer<List<IUnit>> {

	private String name;

	public GetUnitsByFactionIdReturnTypeXmlSerializer() {
		this("GetUnitsByFactionIdReturnType");
	}

	public GetUnitsByFactionIdReturnTypeXmlSerializer(String name) {
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
	public List<IUnit> readObject(IXmlReader reader) {
		return new ListSerializer<IUnit>(getName(), new UnitXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUnit> object) {
		new ListSerializer<IUnit>(getName(), new UnitXmlSerializer("element")).writeObject(writer, object);
	}
}
