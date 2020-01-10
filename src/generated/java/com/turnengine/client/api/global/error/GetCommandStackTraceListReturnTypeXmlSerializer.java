package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.error.ILocalTrace;
import com.turnengine.client.api.local.error.LocalTraceXmlSerializer;
import java.util.List;

public class GetCommandStackTraceListReturnTypeXmlSerializer implements IXmlSerializer<List<ILocalTrace>> {

	private String name;

	public GetCommandStackTraceListReturnTypeXmlSerializer() {
		this("GetCommandStackTraceListReturnType");
	}

	public GetCommandStackTraceListReturnTypeXmlSerializer(String name) {
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
	public List<ILocalTrace> readObject(IXmlReader reader) {
		return new ListSerializer<ILocalTrace>(getName(), new LocalTraceXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<ILocalTrace> object) {
		new ListSerializer<ILocalTrace>(getName(), new LocalTraceXmlSerializer("element")).writeObject(writer, object);
	}
}
