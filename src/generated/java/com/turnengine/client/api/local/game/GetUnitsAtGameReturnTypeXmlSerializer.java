package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class GetUnitsAtGameReturnTypeXmlSerializer implements IXmlSerializer<List<IUnitCount>> {

	private String name;

	public GetUnitsAtGameReturnTypeXmlSerializer() {
		this("GetUnitsAtGameReturnType");
	}

	public GetUnitsAtGameReturnTypeXmlSerializer(String name) {
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
	public List<IUnitCount> readObject(IXmlReader reader) {
		return new ListSerializer<IUnitCount>(getName(), new UnitCountXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUnitCount> object) {
		new ListSerializer<IUnitCount>(getName(), new UnitCountXmlSerializer("element")).writeObject(writer, object);
	}
}
