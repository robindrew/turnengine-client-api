package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAlliancePropertyListReturnTypeXmlSerializer implements IXmlSerializer<List<IAllianceProperty>> {

	private String name;

	public GetAlliancePropertyListReturnTypeXmlSerializer() {
		this("GetAlliancePropertyListReturnType");
	}

	public GetAlliancePropertyListReturnTypeXmlSerializer(String name) {
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
	public List<IAllianceProperty> readObject(IXmlReader reader) {
		return new ListSerializer<IAllianceProperty>(getName(), new AlliancePropertyXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IAllianceProperty> object) {
		new ListSerializer<IAllianceProperty>(getName(), new AlliancePropertyXmlSerializer("element")).writeObject(writer, object);
	}
}
