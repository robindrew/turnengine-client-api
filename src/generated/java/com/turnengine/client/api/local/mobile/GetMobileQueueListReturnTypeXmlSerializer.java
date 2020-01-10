package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetMobileQueueListReturnTypeXmlSerializer implements IXmlSerializer<List<IMobileQueueItem>> {

	private String name;

	public GetMobileQueueListReturnTypeXmlSerializer() {
		this("GetMobileQueueListReturnType");
	}

	public GetMobileQueueListReturnTypeXmlSerializer(String name) {
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
	public List<IMobileQueueItem> readObject(IXmlReader reader) {
		return new ListSerializer<IMobileQueueItem>(getName(), new MobileQueueItemXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IMobileQueueItem> object) {
		new ListSerializer<IMobileQueueItem>(getName(), new MobileQueueItemXmlSerializer("element")).writeObject(writer, object);
	}
}
