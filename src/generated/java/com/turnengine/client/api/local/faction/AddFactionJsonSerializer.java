package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class AddFactionJsonSerializer implements IJsonSerializer<IAddFaction> {

	private String name;

	public AddFactionJsonSerializer() {
		this("AddFaction");
	}

	public AddFactionJsonSerializer(String name) {
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
	public IAddFaction readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAddFaction object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getPassword(), new StringSerializer());
		writer.writeObject(object.getUnited(), new EnumSerializer<FactionUnited>(FactionUnited.class));
		writer.writeInt(object.getPlayerLimit());
		writer.closeObject();
	}
}
