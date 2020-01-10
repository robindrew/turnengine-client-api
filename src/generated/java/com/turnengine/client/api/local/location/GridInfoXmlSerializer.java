package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GridInfoXmlSerializer implements IXmlSerializer<IGridInfo> {

	private String name;

	public GridInfoXmlSerializer() {
		this("GridInfo");
	}

	public GridInfoXmlSerializer(String name) {
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
	public IGridInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("width");
		int param2 = reader.readInt("height");
		int param3 = reader.readInt("startLocationId");
		int param4 = reader.readInt("finishLocationId");
		int param5 = reader.readInt("owned");
		int param6 = reader.readInt("allied");
		int param7 = reader.readInt("hostile");
		List<IGridInfo> param8 = reader.readObject(new ListSerializer<IGridInfo>("gridList", new GridInfoXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new GridInfo(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGridInfo object) {
		writer.startElement(getName());
		writer.writeInt("width", object.getWidth());
		writer.writeInt("height", object.getHeight());
		writer.writeInt("startLocationId", object.getStartLocationId());
		writer.writeInt("finishLocationId", object.getFinishLocationId());
		writer.writeInt("owned", object.getOwned());
		writer.writeInt("allied", object.getAllied());
		writer.writeInt("hostile", object.getHostile());
		writer.writeObject(object.getGridList(), new ListSerializer<IGridInfo>("gridList", new GridInfoXmlSerializer("element")));
		writer.endElement(getName());
	}
}
