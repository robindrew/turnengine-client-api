package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAllianceRankingListXmlSerializer implements IXmlSerializer<IGetAllianceRankingList> {

	private String name;

	public GetAllianceRankingListXmlSerializer() {
		this("GetAllianceRankingList");
	}

	public GetAllianceRankingListXmlSerializer(String name) {
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
	public IGetAllianceRankingList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("groupId");
		int param4 = reader.readInt("pageNumber");
		int param5 = reader.readInt("pageSize");
		reader.endElement(getName());

		// Create the bean
		return new GetAllianceRankingList(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAllianceRankingList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("groupId", object.getGroupId());
		writer.writeInt("pageNumber", object.getPageNumber());
		writer.writeInt("pageSize", object.getPageSize());
		writer.endElement(getName());
	}
}
