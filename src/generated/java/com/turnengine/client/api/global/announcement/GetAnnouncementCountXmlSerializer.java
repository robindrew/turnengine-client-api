package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAnnouncementCountXmlSerializer implements IXmlSerializer<IGetAnnouncementCount> {

	private String name;

	public GetAnnouncementCountXmlSerializer() {
		this("GetAnnouncementCount");
	}

	public GetAnnouncementCountXmlSerializer(String name) {
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
	public IGetAnnouncementCount readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("gameId");
		reader.endElement(getName());

		// Create the bean
		return new GetAnnouncementCount(param1);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAnnouncementCount object) {
		writer.startElement(getName());
		writer.writeInt("gameId", object.getGameId());
		writer.endElement(getName());
	}
}
