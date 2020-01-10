package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetTurnsReturnTypeXmlSerializer implements IXmlSerializer<List<ITurn>> {

	private String name;

	public GetTurnsReturnTypeXmlSerializer() {
		this("GetTurnsReturnType");
	}

	public GetTurnsReturnTypeXmlSerializer(String name) {
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
	public List<ITurn> readObject(IXmlReader reader) {
		return new ListSerializer<ITurn>(getName(), new TurnXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<ITurn> object) {
		new ListSerializer<ITurn>(getName(), new TurnXmlSerializer("element")).writeObject(writer, object);
	}
}
