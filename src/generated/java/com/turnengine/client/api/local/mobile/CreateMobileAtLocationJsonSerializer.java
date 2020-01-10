package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class CreateMobileAtLocationJsonSerializer implements IJsonSerializer<ICreateMobileAtLocation> {

	private String name;

	public CreateMobileAtLocationJsonSerializer() {
		this("CreateMobileAtLocation");
	}

	public CreateMobileAtLocationJsonSerializer(String name) {
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
	public ICreateMobileAtLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ICreateMobileAtLocation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.closeObject();
	}
}
