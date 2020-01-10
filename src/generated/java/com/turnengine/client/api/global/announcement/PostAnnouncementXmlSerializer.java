package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.game.GameLevel;

public class PostAnnouncementXmlSerializer implements IXmlSerializer<IPostAnnouncement> {

	private String name;

	public PostAnnouncementXmlSerializer() {
		this("PostAnnouncement");
	}

	public PostAnnouncementXmlSerializer(String name) {
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
	public IPostAnnouncement readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("gameLevelId");
		GameLevel param3 = reader.readObject(new EnumSerializer<GameLevel>(GameLevel.class, "gameLevel"));
		String param4 = reader.readObject(new StringSerializer("subject"));
		String param5 = reader.readObject(new StringSerializer("body"));
		reader.endElement(getName());

		// Create the bean
		return new PostAnnouncement(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPostAnnouncement object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("gameLevelId", object.getGameLevelId());
		writer.writeObject(object.getGameLevel(), new EnumSerializer<GameLevel>(GameLevel.class, "gameLevel"));
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getBody(), new StringSerializer("body"));
		writer.endElement(getName());
	}
}
