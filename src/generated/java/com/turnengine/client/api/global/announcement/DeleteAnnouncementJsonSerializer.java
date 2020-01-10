package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class DeleteAnnouncementJsonSerializer implements IJsonSerializer<IDeleteAnnouncement> {

	private String name;

	public DeleteAnnouncementJsonSerializer() {
		this("DeleteAnnouncement");
	}

	public DeleteAnnouncementJsonSerializer(String name) {
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
	public IDeleteAnnouncement readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IDeleteAnnouncement object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
		writer.closeObject();
	}
}
