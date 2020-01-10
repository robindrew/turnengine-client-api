package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetTurnDetailsReturnTypeXmlSerializer implements IXmlSerializer<List<ITurnDetails>> {

	private String name;

	public GetTurnDetailsReturnTypeXmlSerializer() {
		this("GetTurnDetailsReturnType");
	}

	public GetTurnDetailsReturnTypeXmlSerializer(String name) {
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
	public List<ITurnDetails> readObject(IXmlReader reader) {
		return new ListSerializer<ITurnDetails>(getName(), new TurnDetailsXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<ITurnDetails> object) {
		new ListSerializer<ITurnDetails>(getName(), new TurnDetailsXmlSerializer("element")).writeObject(writer, object);
	}
}
