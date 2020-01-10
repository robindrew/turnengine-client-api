package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetUpkeepConditionListReturnTypeXmlSerializer implements IXmlSerializer<List<IUpkeepCondition>> {

	private String name;

	public GetUpkeepConditionListReturnTypeXmlSerializer() {
		this("GetUpkeepConditionListReturnType");
	}

	public GetUpkeepConditionListReturnTypeXmlSerializer(String name) {
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
	public List<IUpkeepCondition> readObject(IXmlReader reader) {
		return new ListSerializer<IUpkeepCondition>(getName(), new UpkeepConditionXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUpkeepCondition> object) {
		new ListSerializer<IUpkeepCondition>(getName(), new UpkeepConditionXmlSerializer("element")).writeObject(writer, object);
	}
}
