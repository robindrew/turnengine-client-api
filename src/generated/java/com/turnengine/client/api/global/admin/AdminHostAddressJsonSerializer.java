package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.robindrew.common.locale.Country;

public class AdminHostAddressJsonSerializer implements IJsonSerializer<IAdminHostAddress> {

	private String name;

	public AdminHostAddressJsonSerializer() {
		this("AdminHostAddress");
	}

	public AdminHostAddressJsonSerializer(String name) {
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
	public IAdminHostAddress readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAdminHostAddress object) {
		writer.openObject();
		writer.writeObject(object.getCode(), new StringSerializer());
		writer.writeObject(object.getAddress(), new StringSerializer());
		writer.writeObject(object.getHost(), new StringSerializer());
		writer.writeObject(object.getCountry(), new EnumSerializer<Country>(Country.class));
		writer.writeObject(object.getRegion(), new StringSerializer());
		writer.writeObject(object.getCity(), new StringSerializer());
		writer.writeDouble(object.getLatitude());
		writer.writeDouble(object.getLongitude());
		writer.closeObject();
	}
}
