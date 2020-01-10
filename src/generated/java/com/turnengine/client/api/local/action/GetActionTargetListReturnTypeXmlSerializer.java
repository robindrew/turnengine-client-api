package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetActionTargetListReturnTypeXmlSerializer implements IXmlSerializer<List<IActionTarget>> {

	private String name;

	public GetActionTargetListReturnTypeXmlSerializer() {
		this("GetActionTargetListReturnType");
	}

	public GetActionTargetListReturnTypeXmlSerializer(String name) {
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
	public List<IActionTarget> readObject(IXmlReader reader) {
		return new ListSerializer<IActionTarget>(getName(), new ActionTargetXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IActionTarget> object) {
		new ListSerializer<IActionTarget>(getName(), new ActionTargetXmlSerializer("element")).writeObject(writer, object);
	}
}
