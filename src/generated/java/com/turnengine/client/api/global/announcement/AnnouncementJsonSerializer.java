package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class AnnouncementJsonSerializer implements IJsonSerializer<IAnnouncement> {

	private String name;

	public AnnouncementJsonSerializer() {
		this("Announcement");
	}

	public AnnouncementJsonSerializer(String name) {
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
	public IAnnouncement readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAnnouncement object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeInt(object.getGameId());
		writer.writeObject(object.getGameName(), new StringSerializer());
		writer.writeInt(object.getVersionId());
		writer.writeObject(object.getVersionName(), new StringSerializer());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getInstanceName(), new StringSerializer());
		writer.writeInt(object.getUserId());
		writer.writeObject(object.getUserName(), new StringSerializer());
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getBody(), new StringSerializer());
		writer.closeObject();
	}
}
