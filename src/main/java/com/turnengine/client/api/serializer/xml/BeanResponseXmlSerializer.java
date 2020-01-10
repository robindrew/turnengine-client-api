package com.turnengine.client.api.serializer.xml;

import com.robindrew.codegenerator.api.error.IErrorCodeSet;
import com.robindrew.codegenerator.api.executable.bean.ExecutableBeanResponse;
import com.robindrew.codegenerator.api.executable.bean.IExecutableBeanResponse;
import com.robindrew.codegenerator.api.factory.IObjectFactory;
import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.common.util.Check;

public class BeanResponseXmlSerializer implements IXmlSerializer<IExecutableBeanResponse<?>> {

	private final IObjectFactory<IXmlSerializer<?>> returnSerializerFactory;
	private final ErrorCodeSetXmlSerializer errorSerializer = new ErrorCodeSetXmlSerializer();

	public BeanResponseXmlSerializer(IObjectFactory<IXmlSerializer<?>> returnSerializerFactory) {
		this.returnSerializerFactory = Check.notNull("returnSerializerFactory", returnSerializerFactory);
	}

	@Override
	public IExecutableBeanResponse<?> readObject(IXmlReader reader) {
		reader.startElement("BeanResponse");

		// Attributes
		int id = reader.readIntAttribute("id");
		long duration = reader.readLongAttribute("duration");
		boolean errors = reader.readBooleanAttribute("errors");

		// Errors?
		Object returnValue = null;
		IErrorCodeSet errorSet = null;
		if (errors) {
			errorSet = errorSerializer.readObject(reader);
		}

		// Return Value?
		else {
			IXmlSerializer<?> serializer = returnSerializerFactory.newInstance(id);
			returnValue = reader.readObject(serializer);
		}

		reader.endElement("BeanResponse");
		if (returnValue != null) {
			return new ExecutableBeanResponse<>(id, duration, returnValue);
		} else {
			return new ExecutableBeanResponse<>(id, duration, errorSet);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void writeObject(IXmlWriter writer, IExecutableBeanResponse<?> response) {
		writer.startElement("BeanResponse");

		// Attributes
		int id = response.getBeanId();
		writer.writeAttribute("id", id);
		writer.writeAttribute("duration", response.getDuration());
		writer.writeAttribute("errors", response.hasErrors());

		// Errors
		if (response.hasErrors()) {
			errorSerializer.writeObject(writer, response.getErrors());
		}

		// Return value?
		else {
			IXmlSerializer serializer = returnSerializerFactory.newInstance(id);
			writer.writeObject(response.getReturnValue(), serializer);
		}

		writer.endElement("BeanResponse");
	}

}
