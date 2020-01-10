package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetThreadXmlSerializer implements IXmlSerializer<IGetThread> {

	private String name;

	public GetThreadXmlSerializer() {
		this("GetThread");
	}

	public GetThreadXmlSerializer(String name) {
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
	public IGetThread readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("threadId");
		reader.endElement(getName());

		// Create the bean
		return new GetThread(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetThread object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("threadId", object.getThreadId());
		writer.endElement(getName());
	}
}
