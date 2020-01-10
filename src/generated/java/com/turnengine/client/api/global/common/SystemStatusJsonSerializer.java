package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class SystemStatusJsonSerializer implements IJsonSerializer<ISystemStatus> {

	private String name;

	public SystemStatusJsonSerializer() {
		this("SystemStatus");
	}

	public SystemStatusJsonSerializer(String name) {
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
	public ISystemStatus readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISystemStatus object) {
		writer.openObject();
		writer.writeObject(object.getLoad(), new ListSerializer<ISystemLoadAverage>(new SystemLoadAverageJsonSerializer()));
		writer.writeObject(object.getDisk(), new ListSerializer<ISystemDiskUsage>(new SystemDiskUsageJsonSerializer()));
		writer.closeObject();
	}
}
