package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetActionListReturnTypeXmlSerializer implements IXmlSerializer<List<IAction>> {

	private String name;

	public GetActionListReturnTypeXmlSerializer() {
		this("GetActionListReturnType");
	}

	public GetActionListReturnTypeXmlSerializer(String name) {
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
	public List<IAction> readObject(IXmlReader reader) {
		return new ListSerializer<IAction>(getName(), new ActionXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IAction> object) {
		new ListSerializer<IAction>(getName(), new ActionXmlSerializer("element")).writeObject(writer, object);
	}
}
