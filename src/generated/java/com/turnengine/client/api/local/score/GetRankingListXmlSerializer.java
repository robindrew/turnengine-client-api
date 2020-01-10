package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class GetRankingListXmlSerializer implements IXmlSerializer<IGetRankingList> {

	private String name;

	public GetRankingListXmlSerializer() {
		this("GetRankingList");
	}

	public GetRankingListXmlSerializer(String name) {
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
	public IGetRankingList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		RankingType param3 = reader.readObject(new EnumSerializer<RankingType>(RankingType.class, "type"));
		int param4 = reader.readInt("groupId");
		reader.endElement(getName());

		// Create the bean
		return new GetRankingList(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetRankingList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getType(), new EnumSerializer<RankingType>(RankingType.class, "type"));
		writer.writeInt("groupId", object.getGroupId());
		writer.endElement(getName());
	}
}
