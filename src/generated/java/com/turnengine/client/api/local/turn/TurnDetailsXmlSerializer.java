package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class TurnDetailsXmlSerializer implements IXmlSerializer<ITurnDetails> {

	private String name;

	public TurnDetailsXmlSerializer() {
		this("TurnDetails");
	}

	public TurnDetailsXmlSerializer(String name) {
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
	public ITurnDetails readObject(IXmlReader reader) {
		reader.startElement(getName());
		ITurn param1 = reader.readObject(new TurnXmlSerializer("turn"));
		List<ITurnComponent> param2 = reader.readObject(new ListSerializer<ITurnComponent>("components", new TurnComponentXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new TurnDetails(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITurnDetails object) {
		writer.startElement(getName());
		writer.writeObject(object.getTurn(), new TurnXmlSerializer("turn"));
		writer.writeObject(object.getComponents(), new ListSerializer<ITurnComponent>("components", new TurnComponentXmlSerializer("element")));
		writer.endElement(getName());
	}
}
