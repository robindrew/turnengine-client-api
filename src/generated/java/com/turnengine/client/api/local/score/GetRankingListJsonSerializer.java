package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class GetRankingListJsonSerializer implements IJsonSerializer<IGetRankingList> {

	private String name;

	public GetRankingListJsonSerializer() {
		this("GetRankingList");
	}

	public GetRankingListJsonSerializer(String name) {
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
	public IGetRankingList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetRankingList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getType(), new EnumSerializer<RankingType>(RankingType.class));
		writer.writeInt(object.getGroupId());
		writer.closeObject();
	}
}
