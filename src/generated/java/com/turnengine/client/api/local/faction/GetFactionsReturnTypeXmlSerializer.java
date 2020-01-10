package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetFactionsReturnTypeXmlSerializer implements IXmlSerializer<List<IFaction>> {

	private String name;

	public GetFactionsReturnTypeXmlSerializer() {
		this("GetFactionsReturnType");
	}

	public GetFactionsReturnTypeXmlSerializer(String name) {
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
	public List<IFaction> readObject(IXmlReader reader) {
		return new ListSerializer<IFaction>(getName(), new FactionXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IFaction> object) {
		new ListSerializer<IFaction>(getName(), new FactionXmlSerializer("element")).writeObject(writer, object);
	}
}
