package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetPlayerRankingListJsonSerializer implements IJsonSerializer<IGetPlayerRankingList> {

	private String name;

	public GetPlayerRankingListJsonSerializer() {
		this("GetPlayerRankingList");
	}

	public GetPlayerRankingListJsonSerializer(String name) {
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
	public IGetPlayerRankingList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetPlayerRankingList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
		writer.closeObject();
	}
}
