package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.robindrew.common.locale.Country;
import java.io.IOException;

public class AdminHostAddressDataSerializer extends ObjectSerializer<IAdminHostAddress> {

	public AdminHostAddressDataSerializer() {
		super(false);
	}

	public AdminHostAddressDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAdminHostAddress readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		Country param4 = reader.readObject(new EnumSerializer<Country>(Country.class, false));
		String param5 = reader.readObject(new StringSerializer(false));
		String param6 = reader.readObject(new StringSerializer(false));
		double param7 = reader.readDouble();
		double param8 = reader.readDouble();
		return new AdminHostAddress(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeValue(IDataWriter writer, IAdminHostAddress object) throws IOException {
		writer.writeObject(object.getCode(), new StringSerializer(false));
		writer.writeObject(object.getAddress(), new StringSerializer(false));
		writer.writeObject(object.getHost(), new StringSerializer(false));
		writer.writeObject(object.getCountry(), new EnumSerializer<Country>(Country.class, false));
		writer.writeObject(object.getRegion(), new StringSerializer(false));
		writer.writeObject(object.getCity(), new StringSerializer(false));
		writer.writeDouble(object.getLatitude());
		writer.writeDouble(object.getLongitude());
	}
}
