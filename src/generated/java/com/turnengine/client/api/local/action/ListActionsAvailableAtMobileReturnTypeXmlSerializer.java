package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class ListActionsAvailableAtMobileReturnTypeXmlSerializer implements IXmlSerializer<List<IActionAvailable>> {

	private String name;

	public ListActionsAvailableAtMobileReturnTypeXmlSerializer() {
		this("ListActionsAvailableAtMobileReturnType");
	}

	public ListActionsAvailableAtMobileReturnTypeXmlSerializer(String name) {
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
	public List<IActionAvailable> readObject(IXmlReader reader) {
		return new ListSerializer<IActionAvailable>(getName(), new ActionAvailableXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IActionAvailable> object) {
		new ListSerializer<IActionAvailable>(getName(), new ActionAvailableXmlSerializer("element")).writeObject(writer, object);
	}
}
