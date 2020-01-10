package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class DestroyEmptyMobileJsonSerializer implements IJsonSerializer<IDestroyEmptyMobile> {

	private String name;

	public DestroyEmptyMobileJsonSerializer() {
		this("DestroyEmptyMobile");
	}

	public DestroyEmptyMobileJsonSerializer(String name) {
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
	public IDestroyEmptyMobile readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IDestroyEmptyMobile object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.closeObject();
	}
}
