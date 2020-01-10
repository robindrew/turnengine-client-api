package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetActionConditionListReturnTypeXmlSerializer implements IXmlSerializer<List<IActionCondition>> {

	private String name;

	public GetActionConditionListReturnTypeXmlSerializer() {
		this("GetActionConditionListReturnType");
	}

	public GetActionConditionListReturnTypeXmlSerializer(String name) {
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
	public List<IActionCondition> readObject(IXmlReader reader) {
		return new ListSerializer<IActionCondition>(getName(), new ActionConditionXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IActionCondition> object) {
		new ListSerializer<IActionCondition>(getName(), new ActionConditionXmlSerializer("element")).writeObject(writer, object);
	}
}
