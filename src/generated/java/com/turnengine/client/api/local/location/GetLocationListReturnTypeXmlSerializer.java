package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetLocationListReturnTypeXmlSerializer implements IXmlSerializer<List<ILocation>> {

	private String name;

	public GetLocationListReturnTypeXmlSerializer() {
		this("GetLocationListReturnType");
	}

	public GetLocationListReturnTypeXmlSerializer(String name) {
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
	public List<ILocation> readObject(IXmlReader reader) {
		return new ListSerializer<ILocation>(getName(), new LocationXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<ILocation> object) {
		new ListSerializer<ILocation>(getName(), new LocationXmlSerializer("element")).writeObject(writer, object);
	}
}
