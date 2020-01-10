package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class RequestToJoinAllianceByNameJsonSerializer implements IJsonSerializer<IRequestToJoinAllianceByName> {

	private String name;

	public RequestToJoinAllianceByNameJsonSerializer() {
		this("RequestToJoinAllianceByName");
	}

	public RequestToJoinAllianceByNameJsonSerializer(String name) {
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
	public IRequestToJoinAllianceByName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IRequestToJoinAllianceByName object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getAllianceName(), new StringSerializer());
		writer.closeObject();
	}
}
