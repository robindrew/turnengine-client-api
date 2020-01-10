package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.IntArraySerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;

public class LocationInfoXmlSerializer implements IXmlSerializer<ILocationInfo> {

	private String name;

	public LocationInfoXmlSerializer() {
		this("LocationInfo");
	}

	public LocationInfoXmlSerializer(String name) {
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
	public ILocationInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int[] param3 = reader.readObject(new IntArraySerializer("coordinates"));
		IPlayerInfo param4 = reader.readObject(new PlayerInfoXmlSerializer("player"));
		reader.endElement(getName());

		// Create the bean
		return new LocationInfo(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocationInfo object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getCoordinates(), new IntArraySerializer("coordinates"));
		writer.writeObject(object.getPlayer(), new PlayerInfoXmlSerializer("player"));
		writer.endElement(getName());
	}
}
