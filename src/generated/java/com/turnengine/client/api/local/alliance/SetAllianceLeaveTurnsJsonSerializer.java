package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SetAllianceLeaveTurnsJsonSerializer implements IJsonSerializer<ISetAllianceLeaveTurns> {

	private String name;

	public SetAllianceLeaveTurnsJsonSerializer() {
		this("SetAllianceLeaveTurns");
	}

	public SetAllianceLeaveTurnsJsonSerializer(String name) {
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
	public ISetAllianceLeaveTurns readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetAllianceLeaveTurns object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getTurns());
		writer.closeObject();
	}
}
