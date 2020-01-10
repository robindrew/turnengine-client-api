package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class GetTurnUpdatingReturnTypeXmlSerializer implements IXmlSerializer<TurnUpdating> {

	private String name;

	public GetTurnUpdatingReturnTypeXmlSerializer() {
		this("GetTurnUpdatingReturnType");
	}

	public GetTurnUpdatingReturnTypeXmlSerializer(String name) {
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
	public TurnUpdating readObject(IXmlReader reader) {
		return new EnumSerializer<TurnUpdating>(TurnUpdating.class, getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, TurnUpdating object) {
		new EnumSerializer<TurnUpdating>(TurnUpdating.class, getName()).writeObject(writer, object);
	}
}
