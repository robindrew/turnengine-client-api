package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAnnouncementListReturnTypeJsonSerializer implements IJsonSerializer<List<IAnnouncement>> {

	private String name;

	public GetAnnouncementListReturnTypeJsonSerializer() {
		this("GetAnnouncementListReturnType");
	}

	public GetAnnouncementListReturnTypeJsonSerializer(String name) {
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
	public List<IAnnouncement> readObject(IJsonReader reader) {
		return new ListSerializer<IAnnouncement>(new AnnouncementJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IAnnouncement> object) {
		new ListSerializer<IAnnouncement>(new AnnouncementJsonSerializer()).writeObject(writer, object);
	}
}
