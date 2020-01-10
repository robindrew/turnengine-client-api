package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GridJsonSerializer implements IJsonSerializer<IGrid> {

	private String name;

	public GridJsonSerializer() {
		this("Grid");
	}

	public GridJsonSerializer(String name) {
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
	public IGrid readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGrid object) {
		writer.openObject();
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeInt(object.getStartLocationId());
		writer.writeInt(object.getFinishLocationId());
		writer.writeObject(object.getGridList(), new ListSerializer<IGrid>(new GridJsonSerializer()));
		writer.closeObject();
	}
}
