package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class FactionJsonSerializer implements IJsonSerializer<IFaction> {

	private String name;

	public FactionJsonSerializer() {
		this("Faction");
	}

	public FactionJsonSerializer(String name) {
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
	public IFaction readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IFaction object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getPassword(), new StringSerializer());
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class));
		writer.writeInt(object.getPlayerLimit());
		writer.closeObject();
	}
}
