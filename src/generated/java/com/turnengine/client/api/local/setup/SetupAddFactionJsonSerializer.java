package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.faction.FactionUnited;

public class SetupAddFactionJsonSerializer implements IJsonSerializer<ISetupAddFaction> {

	private String name;

	public SetupAddFactionJsonSerializer() {
		this("SetupAddFaction");
	}

	public SetupAddFactionJsonSerializer(String name) {
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
	public ISetupAddFaction readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupAddFaction object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getPassword(), new StringSerializer());
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class));
		writer.writeInt(object.getPlayerLimit());
		writer.closeObject();
	}
}
