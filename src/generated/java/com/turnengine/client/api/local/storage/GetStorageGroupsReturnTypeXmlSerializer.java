package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetStorageGroupsReturnTypeXmlSerializer implements IXmlSerializer<List<IStorageGroup>> {

	private String name;

	public GetStorageGroupsReturnTypeXmlSerializer() {
		this("GetStorageGroupsReturnType");
	}

	public GetStorageGroupsReturnTypeXmlSerializer(String name) {
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
	public List<IStorageGroup> readObject(IXmlReader reader) {
		return new ListSerializer<IStorageGroup>(getName(), new StorageGroupXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IStorageGroup> object) {
		new ListSerializer<IStorageGroup>(getName(), new StorageGroupXmlSerializer("element")).writeObject(writer, object);
	}
}
