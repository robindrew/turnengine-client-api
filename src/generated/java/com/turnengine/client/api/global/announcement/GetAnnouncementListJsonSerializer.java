package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.game.GameLevel;

public class GetAnnouncementListJsonSerializer implements IJsonSerializer<IGetAnnouncementList> {

	private String name;

	public GetAnnouncementListJsonSerializer() {
		this("GetAnnouncementList");
	}

	public GetAnnouncementListJsonSerializer(String name) {
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
	public IGetAnnouncementList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAnnouncementList object) {
		writer.openObject();
		writer.writeInt(object.getGameLevelId());
		writer.writeObject(object.getGameLevel(), new EnumSerializer<GameLevel>(GameLevel.class));
		writer.closeObject();
	}
}
