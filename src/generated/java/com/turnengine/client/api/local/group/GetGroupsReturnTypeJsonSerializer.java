package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetGroupsReturnTypeJsonSerializer implements IJsonSerializer<List<IGroup>> {

	private String name;

	public GetGroupsReturnTypeJsonSerializer() {
		this("GetGroupsReturnType");
	}

	public GetGroupsReturnTypeJsonSerializer(String name) {
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
	public List<IGroup> readObject(IJsonReader reader) {
		return new ListSerializer<IGroup>(new GroupJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IGroup> object) {
		new ListSerializer<IGroup>(new GroupJsonSerializer()).writeObject(writer, object);
	}
}
