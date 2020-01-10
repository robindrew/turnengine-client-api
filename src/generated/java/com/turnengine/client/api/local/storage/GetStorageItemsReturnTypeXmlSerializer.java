package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetStorageItemsReturnTypeXmlSerializer implements IXmlSerializer<List<IStorageItem>> {

	private String name;

	public GetStorageItemsReturnTypeXmlSerializer() {
		this("GetStorageItemsReturnType");
	}

	public GetStorageItemsReturnTypeXmlSerializer(String name) {
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
	public List<IStorageItem> readObject(IXmlReader reader) {
		return new ListSerializer<IStorageItem>(getName(), new StorageItemXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IStorageItem> object) {
		new ListSerializer<IStorageItem>(getName(), new StorageItemXmlSerializer("element")).writeObject(writer, object);
	}
}
