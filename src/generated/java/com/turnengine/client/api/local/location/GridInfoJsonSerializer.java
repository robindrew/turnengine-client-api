package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GridInfoJsonSerializer implements IJsonSerializer<IGridInfo> {

	private String name;

	public GridInfoJsonSerializer() {
		this("GridInfo");
	}

	public GridInfoJsonSerializer(String name) {
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
	public IGridInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGridInfo object) {
		writer.openObject();
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeInt(object.getStartLocationId());
		writer.writeInt(object.getFinishLocationId());
		writer.writeInt(object.getOwned());
		writer.writeInt(object.getAllied());
		writer.writeInt(object.getHostile());
		writer.writeObject(object.getGridList(), new ListSerializer<IGridInfo>(new GridInfoJsonSerializer()));
		writer.closeObject();
	}
}
