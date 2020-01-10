package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;
import java.io.IOException;
import java.util.List;

public class GeneratedLocationDataSerializer extends ObjectSerializer<IGeneratedLocation> {

	public GeneratedLocationDataSerializer() {
		super(false);
	}

	public GeneratedLocationDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGeneratedLocation readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		LocationSignup param2 = reader.readObject(new EnumSerializer<LocationSignup>(LocationSignup.class, false));
		int param3 = reader.readInt();
		List<IUnitCount> param4 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		return new GeneratedLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGeneratedLocation object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getSignup(), new EnumSerializer<LocationSignup>(LocationSignup.class, false));
		writer.writeInt(object.getSignupFactionId());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
	}
}
