package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class SetTurnsEnabledXmlSerializer implements IXmlSerializer<ISetTurnsEnabled> {

	private String name;

	public SetTurnsEnabledXmlSerializer() {
		this("SetTurnsEnabled");
	}

	public SetTurnsEnabledXmlSerializer(String name) {
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
	public ISetTurnsEnabled readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		TurnsEnabled param3 = reader.readObject(new EnumSerializer<TurnsEnabled>(TurnsEnabled.class, "updating"));
		reader.endElement(getName());

		// Create the bean
		return new SetTurnsEnabled(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetTurnsEnabled object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getUpdating(), new EnumSerializer<TurnsEnabled>(TurnsEnabled.class, "updating"));
		writer.endElement(getName());
	}
}
