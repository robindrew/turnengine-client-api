package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetUpkeepListReturnTypeXmlSerializer implements IXmlSerializer<List<IUpkeep>> {

	private String name;

	public GetUpkeepListReturnTypeXmlSerializer() {
		this("GetUpkeepListReturnType");
	}

	public GetUpkeepListReturnTypeXmlSerializer(String name) {
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
	public List<IUpkeep> readObject(IXmlReader reader) {
		return new ListSerializer<IUpkeep>(getName(), new UpkeepXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUpkeep> object) {
		new ListSerializer<IUpkeep>(getName(), new UpkeepXmlSerializer("element")).writeObject(writer, object);
	}
}
