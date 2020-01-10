package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class SetTurnsEnabledReturnTypeXmlSerializer implements IXmlSerializer<TurnsEnabled> {

	private String name;

	public SetTurnsEnabledReturnTypeXmlSerializer() {
		this("SetTurnsEnabledReturnType");
	}

	public SetTurnsEnabledReturnTypeXmlSerializer(String name) {
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
	public TurnsEnabled readObject(IXmlReader reader) {
		return new EnumSerializer<TurnsEnabled>(TurnsEnabled.class, getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, TurnsEnabled object) {
		new EnumSerializer<TurnsEnabled>(TurnsEnabled.class, getName()).writeObject(writer, object);
	}
}
