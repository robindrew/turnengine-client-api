package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class SystemLoadAverageJsonSerializer implements IJsonSerializer<ISystemLoadAverage> {

	private String name;

	public SystemLoadAverageJsonSerializer() {
		this("SystemLoadAverage");
	}

	public SystemLoadAverageJsonSerializer(String name) {
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
	public ISystemLoadAverage readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISystemLoadAverage object) {
		writer.openObject();
		writer.writeObject(object.getPeriod(), new EnumSerializer<LoadAveragePeriod>(LoadAveragePeriod.class));
		writer.writeDouble(object.getAverage());
		writer.closeObject();
	}
}
