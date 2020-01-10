package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceByIdJsonSerializer implements IJsonSerializer<IGetAllianceById> {

	private String name;

	public GetAllianceByIdJsonSerializer() {
		this("GetAllianceById");
	}

	public GetAllianceByIdJsonSerializer(String name) {
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
	public IGetAllianceById readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAllianceById object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
		writer.closeObject();
	}
}
