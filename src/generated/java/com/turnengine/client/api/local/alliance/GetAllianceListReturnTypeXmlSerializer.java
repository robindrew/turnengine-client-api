package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllianceListReturnTypeXmlSerializer implements IXmlSerializer<List<IAlliance>> {

	private String name;

	public GetAllianceListReturnTypeXmlSerializer() {
		this("GetAllianceListReturnType");
	}

	public GetAllianceListReturnTypeXmlSerializer(String name) {
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
	public List<IAlliance> readObject(IXmlReader reader) {
		return new ListSerializer<IAlliance>(getName(), new AllianceXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IAlliance> object) {
		new ListSerializer<IAlliance>(getName(), new AllianceXmlSerializer("element")).writeObject(writer, object);
	}
}
