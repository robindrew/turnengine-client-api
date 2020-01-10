package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetLoggedExceptionsReturnTypeXmlSerializer implements IXmlSerializer<List<ILoggedException>> {

	private String name;

	public GetLoggedExceptionsReturnTypeXmlSerializer() {
		this("GetLoggedExceptionsReturnType");
	}

	public GetLoggedExceptionsReturnTypeXmlSerializer(String name) {
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
	public List<ILoggedException> readObject(IXmlReader reader) {
		return new ListSerializer<ILoggedException>(getName(), new LoggedExceptionXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<ILoggedException> object) {
		new ListSerializer<ILoggedException>(getName(), new LoggedExceptionXmlSerializer("element")).writeObject(writer, object);
	}
}
