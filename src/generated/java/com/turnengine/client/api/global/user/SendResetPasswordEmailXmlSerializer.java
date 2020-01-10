package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SendResetPasswordEmailXmlSerializer implements IXmlSerializer<ISendResetPasswordEmail> {

	private String name;

	public SendResetPasswordEmailXmlSerializer() {
		this("SendResetPasswordEmail");
	}

	public SendResetPasswordEmailXmlSerializer(String name) {
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
	public ISendResetPasswordEmail readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("email"));
		reader.endElement(getName());

		// Create the bean
		return new SendResetPasswordEmail(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISendResetPasswordEmail object) {
		writer.startElement(getName());
		writer.writeObject(object.getEmail(), new StringSerializer("email"));
		writer.endElement(getName());
	}
}
