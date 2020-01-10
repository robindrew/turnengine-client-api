package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class InviteToJoinAllianceByNameJsonSerializer implements IJsonSerializer<IInviteToJoinAllianceByName> {

	private String name;

	public InviteToJoinAllianceByNameJsonSerializer() {
		this("InviteToJoinAllianceByName");
	}

	public InviteToJoinAllianceByNameJsonSerializer(String name) {
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
	public IInviteToJoinAllianceByName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IInviteToJoinAllianceByName object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getPlayerName(), new StringSerializer());
		writer.closeObject();
	}
}
