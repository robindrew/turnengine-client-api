package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class ListActionsQueuedAtLocationReturnTypeXmlSerializer implements IXmlSerializer<List<IActionQueued>> {

	private String name;

	public ListActionsQueuedAtLocationReturnTypeXmlSerializer() {
		this("ListActionsQueuedAtLocationReturnType");
	}

	public ListActionsQueuedAtLocationReturnTypeXmlSerializer(String name) {
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
	public List<IActionQueued> readObject(IXmlReader reader) {
		return new ListSerializer<IActionQueued>(getName(), new ActionQueuedXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IActionQueued> object) {
		new ListSerializer<IActionQueued>(getName(), new ActionQueuedXmlSerializer("element")).writeObject(writer, object);
	}
}
