package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GetServiceProcessListXmlSerializer implements IXmlSerializer<IGetServiceProcessList> {

	private String name;

	public GetServiceProcessListXmlSerializer() {
		this("GetServiceProcessList");
	}

	public GetServiceProcessListXmlSerializer(String name) {
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
	public IGetServiceProcessList readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("project"));
		reader.endElement(getName());

		// Create the bean
		return new GetServiceProcessList(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetServiceProcessList object) {
		writer.startElement(getName());
		writer.writeObject(object.getProject(), new StringSerializer("project"));
		writer.endElement(getName());
	}
}
