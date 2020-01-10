package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetForumListXmlSerializer implements IXmlSerializer<IGetForumList> {

	private String name;

	public GetForumListXmlSerializer() {
		this("GetForumList");
	}

	public GetForumListXmlSerializer(String name) {
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
	public IGetForumList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		reader.endElement(getName());

		// Create the bean
		return new GetForumList(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetForumList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.endElement(getName());
	}
}
