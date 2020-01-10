package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.game.GameLevel;

public class PostAnnouncementJsonSerializer implements IJsonSerializer<IPostAnnouncement> {

	private String name;

	public PostAnnouncementJsonSerializer() {
		this("PostAnnouncement");
	}

	public PostAnnouncementJsonSerializer(String name) {
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
	public IPostAnnouncement readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IPostAnnouncement object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getGameLevelId());
		writer.writeObject(object.getGameLevel(), new EnumSerializer<GameLevel>(GameLevel.class));
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getBody(), new StringSerializer());
		writer.closeObject();
	}
}
