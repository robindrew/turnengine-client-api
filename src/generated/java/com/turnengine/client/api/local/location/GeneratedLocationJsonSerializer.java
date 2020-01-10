package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountJsonSerializer;
import java.util.List;

public class GeneratedLocationJsonSerializer implements IJsonSerializer<IGeneratedLocation> {

	private String name;

	public GeneratedLocationJsonSerializer() {
		this("GeneratedLocation");
	}

	public GeneratedLocationJsonSerializer(String name) {
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
	public IGeneratedLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGeneratedLocation object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getSignup(), new EnumSerializer<LocationSignup>(LocationSignup.class));
		writer.writeInt(object.getSignupFactionId());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.closeObject();
	}
}
