package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceRankingListJsonSerializer implements IJsonSerializer<IGetAllianceRankingList> {

	private String name;

	public GetAllianceRankingListJsonSerializer() {
		this("GetAllianceRankingList");
	}

	public GetAllianceRankingListJsonSerializer(String name) {
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
	public IGetAllianceRankingList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAllianceRankingList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
		writer.closeObject();
	}
}
