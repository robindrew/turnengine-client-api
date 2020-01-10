package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.robindrew.common.locale.Country;

public class AdminHostAddressXmlSerializer implements IXmlSerializer<IAdminHostAddress> {

	private String name;

	public AdminHostAddressXmlSerializer() {
		this("AdminHostAddress");
	}

	public AdminHostAddressXmlSerializer(String name) {
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
	public IAdminHostAddress readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("code"));
		String param2 = reader.readObject(new StringSerializer("address"));
		String param3 = reader.readObject(new StringSerializer("host"));
		Country param4 = reader.readObject(new EnumSerializer<Country>(Country.class, "country"));
		String param5 = reader.readObject(new StringSerializer("region"));
		String param6 = reader.readObject(new StringSerializer("city"));
		double param7 = reader.readDouble("latitude");
		double param8 = reader.readDouble("longitude");
		reader.endElement(getName());

		// Create the bean
		return new AdminHostAddress(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAdminHostAddress object) {
		writer.startElement(getName());
		writer.writeObject(object.getCode(), new StringSerializer("code"));
		writer.writeObject(object.getAddress(), new StringSerializer("address"));
		writer.writeObject(object.getHost(), new StringSerializer("host"));
		writer.writeObject(object.getCountry(), new EnumSerializer<Country>(Country.class, "country"));
		writer.writeObject(object.getRegion(), new StringSerializer("region"));
		writer.writeObject(object.getCity(), new StringSerializer("city"));
		writer.writeDouble("latitude", object.getLatitude());
		writer.writeDouble("longitude", object.getLongitude());
		writer.endElement(getName());
	}
}
