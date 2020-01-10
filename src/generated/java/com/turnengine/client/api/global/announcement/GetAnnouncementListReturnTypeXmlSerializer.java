package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetAnnouncementListReturnTypeXmlSerializer implements IXmlSerializer<List<IAnnouncement>> {

	private String name;

	public GetAnnouncementListReturnTypeXmlSerializer() {
		this("GetAnnouncementListReturnType");
	}

	public GetAnnouncementListReturnTypeXmlSerializer(String name) {
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
	public List<IAnnouncement> readObject(IXmlReader reader) {
		return new ListSerializer<IAnnouncement>(getName(), new AnnouncementXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IAnnouncement> object) {
		new ListSerializer<IAnnouncement>(getName(), new AnnouncementXmlSerializer("element")).writeObject(writer, object);
	}
}
