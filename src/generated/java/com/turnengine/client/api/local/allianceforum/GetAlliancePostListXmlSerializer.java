package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAlliancePostListXmlSerializer implements IXmlSerializer<IGetAlliancePostList> {

	private String name;

	public GetAlliancePostListXmlSerializer() {
		this("GetAlliancePostList");
	}

	public GetAlliancePostListXmlSerializer(String name) {
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
	public IGetAlliancePostList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("threadId");
		int param4 = reader.readInt("pageNumber");
		int param5 = reader.readInt("pageSize");
		reader.endElement(getName());

		// Create the bean
		return new GetAlliancePostList(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAlliancePostList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("threadId", object.getThreadId());
		writer.writeInt("pageNumber", object.getPageNumber());
		writer.writeInt("pageSize", object.getPageSize());
		writer.endElement(getName());
	}
}
