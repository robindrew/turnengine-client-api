package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.BooleanSerializer;

public class SetSignupVerificationXmlSerializer implements IXmlSerializer<ISetSignupVerification> {

	private String name;

	public SetSignupVerificationXmlSerializer() {
		this("SetSignupVerification");
	}

	public SetSignupVerificationXmlSerializer(String name) {
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
	public ISetSignupVerification readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		Boolean param2 = reader.readObject(new BooleanSerializer("enabled"));
		reader.endElement(getName());

		// Create the bean
		return new SetSignupVerification(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetSignupVerification object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getEnabled(), new BooleanSerializer("enabled"));
		writer.endElement(getName());
	}
}
