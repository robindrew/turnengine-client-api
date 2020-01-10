package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetLocationPropertyListReturnTypeXmlSerializer implements IXmlSerializer<List<ILocationProperty>> {

	private String name;

	public GetLocationPropertyListReturnTypeXmlSerializer() {
		this("GetLocationPropertyListReturnType");
	}

	public GetLocationPropertyListReturnTypeXmlSerializer(String name) {
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
	public List<ILocationProperty> readObject(IXmlReader reader) {
		return new ListSerializer<ILocationProperty>(getName(), new LocationPropertyXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<ILocationProperty> object) {
		new ListSerializer<ILocationProperty>(getName(), new LocationPropertyXmlSerializer("element")).writeObject(writer, object);
	}
}
