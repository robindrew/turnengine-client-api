package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GridXmlSerializer implements IXmlSerializer<IGrid> {

	private String name;

	public GridXmlSerializer() {
		this("Grid");
	}

	public GridXmlSerializer(String name) {
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
	public IGrid readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("width");
		int param2 = reader.readInt("height");
		int param3 = reader.readInt("startLocationId");
		int param4 = reader.readInt("finishLocationId");
		List<IGrid> param5 = reader.readObject(new ListSerializer<IGrid>("gridList", new GridXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new Grid(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGrid object) {
		writer.startElement(getName());
		writer.writeInt("width", object.getWidth());
		writer.writeInt("height", object.getHeight());
		writer.writeInt("startLocationId", object.getStartLocationId());
		writer.writeInt("finishLocationId", object.getFinishLocationId());
		writer.writeObject(object.getGridList(), new ListSerializer<IGrid>("gridList", new GridXmlSerializer("element")));
		writer.endElement(getName());
	}
}
