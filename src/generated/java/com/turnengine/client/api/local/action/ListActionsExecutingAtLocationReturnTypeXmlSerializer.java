package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class ListActionsExecutingAtLocationReturnTypeXmlSerializer implements IXmlSerializer<List<IActionExecuting>> {

	private String name;

	public ListActionsExecutingAtLocationReturnTypeXmlSerializer() {
		this("ListActionsExecutingAtLocationReturnType");
	}

	public ListActionsExecutingAtLocationReturnTypeXmlSerializer(String name) {
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
	public List<IActionExecuting> readObject(IXmlReader reader) {
		return new ListSerializer<IActionExecuting>(getName(), new ActionExecutingXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IActionExecuting> object) {
		new ListSerializer<IActionExecuting>(getName(), new ActionExecutingXmlSerializer("element")).writeObject(writer, object);
	}
}
