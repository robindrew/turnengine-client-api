package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetMobileQueueListReturnTypeJsonSerializer implements IJsonSerializer<List<IMobileQueueItem>> {

	private String name;

	public GetMobileQueueListReturnTypeJsonSerializer() {
		this("GetMobileQueueListReturnType");
	}

	public GetMobileQueueListReturnTypeJsonSerializer(String name) {
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
	public List<IMobileQueueItem> readObject(IJsonReader reader) {
		return new ListSerializer<IMobileQueueItem>(new MobileQueueItemJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IMobileQueueItem> object) {
		new ListSerializer<IMobileQueueItem>(new MobileQueueItemJsonSerializer()).writeObject(writer, object);
	}
}
