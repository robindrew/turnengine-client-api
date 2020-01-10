package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetSignupUserEmailXmlSerializer implements IXmlSerializer<ISetSignupUserEmail> {

	private String name;

	public SetSignupUserEmailXmlSerializer() {
		this("SetSignupUserEmail");
	}

	public SetSignupUserEmailXmlSerializer(String name) {
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
	public ISetSignupUserEmail readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("subject"));
		String param4 = reader.readObject(new StringSerializer("content"));
		reader.endElement(getName());

		// Create the bean
		return new SetSignupUserEmail(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetSignupUserEmail object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getContent(), new StringSerializer("content"));
		writer.endElement(getName());
	}
}
