package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetTurnSummaryReturnTypeXmlSerializer implements IXmlSerializer<ITurnSummary> {

	private String name;

	public GetTurnSummaryReturnTypeXmlSerializer() {
		this("GetTurnSummaryReturnType");
	}

	public GetTurnSummaryReturnTypeXmlSerializer(String name) {
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
	public ITurnSummary readObject(IXmlReader reader) {
		return new TurnSummaryXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITurnSummary object) {
		new TurnSummaryXmlSerializer(getName()).writeObject(writer, object);
	}
}
