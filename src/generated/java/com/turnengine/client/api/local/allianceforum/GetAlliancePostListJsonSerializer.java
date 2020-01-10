package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAlliancePostListJsonSerializer implements IJsonSerializer<IGetAlliancePostList> {

	private String name;

	public GetAlliancePostListJsonSerializer() {
		this("GetAlliancePostList");
	}

	public GetAlliancePostListJsonSerializer(String name) {
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
	public IGetAlliancePostList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAlliancePostList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getThreadId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
		writer.closeObject();
	}
}
