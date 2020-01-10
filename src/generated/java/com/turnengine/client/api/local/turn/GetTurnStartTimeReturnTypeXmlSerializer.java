package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.LongSerializer;

public class GetTurnStartTimeReturnTypeXmlSerializer implements IXmlSerializer<Long> {

	private String name;

	public GetTurnStartTimeReturnTypeXmlSerializer() {
		this("GetTurnStartTimeReturnType");
	}

	public GetTurnStartTimeReturnTypeXmlSerializer(String name) {
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
	public Long readObject(IXmlReader reader) {
		return new LongSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, Long object) {
		new LongSerializer(getName()).writeObject(writer, object);
	}
}
