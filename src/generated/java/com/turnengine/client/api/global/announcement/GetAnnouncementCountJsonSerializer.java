package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAnnouncementCountJsonSerializer implements IJsonSerializer<IGetAnnouncementCount> {

	private String name;

	public GetAnnouncementCountJsonSerializer() {
		this("GetAnnouncementCount");
	}

	public GetAnnouncementCountJsonSerializer(String name) {
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
	public IGetAnnouncementCount readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAnnouncementCount object) {
		writer.openObject();
		writer.writeInt(object.getGameId());
		writer.closeObject();
	}
}
