package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AnnouncementXmlSerializer implements IXmlSerializer<IAnnouncement> {

	private String name;

	public AnnouncementXmlSerializer() {
		this("Announcement");
	}

	public AnnouncementXmlSerializer(String name) {
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
	public IAnnouncement readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		int param2 = reader.readInt("gameId");
		String param3 = reader.readObject(new StringSerializer("gameName"));
		int param4 = reader.readInt("versionId");
		String param5 = reader.readObject(new StringSerializer("versionName"));
		int param6 = reader.readInt("instanceId");
		String param7 = reader.readObject(new StringSerializer("instanceName"));
		int param8 = reader.readInt("userId");
		String param9 = reader.readObject(new StringSerializer("userName"));
		long param10 = reader.readLong("timestamp");
		String param11 = reader.readObject(new StringSerializer("subject"));
		String param12 = reader.readObject(new StringSerializer("body"));
		reader.endElement(getName());

		// Create the bean
		return new Announcement(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAnnouncement object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeInt("gameId", object.getGameId());
		writer.writeObject(object.getGameName(), new StringSerializer("gameName"));
		writer.writeInt("versionId", object.getVersionId());
		writer.writeObject(object.getVersionName(), new StringSerializer("versionName"));
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getInstanceName(), new StringSerializer("instanceName"));
		writer.writeInt("userId", object.getUserId());
		writer.writeObject(object.getUserName(), new StringSerializer("userName"));
		writer.writeLong("timestamp", object.getTimestamp());
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getBody(), new StringSerializer("body"));
		writer.endElement(getName());
	}
}
