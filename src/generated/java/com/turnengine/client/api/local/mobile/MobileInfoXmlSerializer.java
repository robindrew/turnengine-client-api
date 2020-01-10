package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;

public class MobileInfoXmlSerializer implements IXmlSerializer<IMobileInfo> {

	private String name;

	public MobileInfoXmlSerializer() {
		this("MobileInfo");
	}

	public MobileInfoXmlSerializer(String name) {
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
	public IMobileInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		IPlayerInfo param3 = reader.readObject(new PlayerInfoXmlSerializer("player"));
		reader.endElement(getName());

		// Create the bean
		return new MobileInfo(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMobileInfo object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPlayer(), new PlayerInfoXmlSerializer("player"));
		writer.endElement(getName());
	}
}
