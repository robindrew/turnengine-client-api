package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.game.GameLevel;

public class GetAnnouncementListXmlSerializer implements IXmlSerializer<IGetAnnouncementList> {

	private String name;

	public GetAnnouncementListXmlSerializer() {
		this("GetAnnouncementList");
	}

	public GetAnnouncementListXmlSerializer(String name) {
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
	public IGetAnnouncementList readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("gameLevelId");
		GameLevel param2 = reader.readObject(new EnumSerializer<GameLevel>(GameLevel.class, "gameLevel"));
		reader.endElement(getName());

		// Create the bean
		return new GetAnnouncementList(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAnnouncementList object) {
		writer.startElement(getName());
		writer.writeInt("gameLevelId", object.getGameLevelId());
		writer.writeObject(object.getGameLevel(), new EnumSerializer<GameLevel>(GameLevel.class, "gameLevel"));
		writer.endElement(getName());
	}
}
