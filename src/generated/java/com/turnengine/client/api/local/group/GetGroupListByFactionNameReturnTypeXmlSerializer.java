package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetGroupListByFactionNameReturnTypeXmlSerializer implements IXmlSerializer<List<IGroup>> {

	private String name;

	public GetGroupListByFactionNameReturnTypeXmlSerializer() {
		this("GetGroupListByFactionNameReturnType");
	}

	public GetGroupListByFactionNameReturnTypeXmlSerializer(String name) {
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
	public List<IGroup> readObject(IXmlReader reader) {
		return new ListSerializer<IGroup>(getName(), new GroupXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IGroup> object) {
		new ListSerializer<IGroup>(getName(), new GroupXmlSerializer("element")).writeObject(writer, object);
	}
}
