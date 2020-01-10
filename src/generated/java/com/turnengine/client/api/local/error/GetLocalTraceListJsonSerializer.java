package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetLocalTraceListJsonSerializer implements IJsonSerializer<IGetLocalTraceList> {

	private String name;

	public GetLocalTraceListJsonSerializer() {
		this("GetLocalTraceList");
	}

	public GetLocalTraceListJsonSerializer(String name) {
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
	public IGetLocalTraceList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetLocalTraceList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeLong(object.getFrom());
		writer.writeLong(object.getTo());
		writer.closeObject();
	}
}
