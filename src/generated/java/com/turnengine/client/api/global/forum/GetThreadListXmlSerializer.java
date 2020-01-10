package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetThreadListXmlSerializer implements IXmlSerializer<IGetThreadList> {

	private String name;

	public GetThreadListXmlSerializer() {
		this("GetThreadList");
	}

	public GetThreadListXmlSerializer(String name) {
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
	public IGetThreadList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("forumId");
		int param3 = reader.readInt("pageNumber");
		int param4 = reader.readInt("pageSize");
		reader.endElement(getName());

		// Create the bean
		return new GetThreadList(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetThreadList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("forumId", object.getForumId());
		writer.writeInt("pageNumber", object.getPageNumber());
		writer.writeInt("pageSize", object.getPageSize());
		writer.endElement(getName());
	}
}
