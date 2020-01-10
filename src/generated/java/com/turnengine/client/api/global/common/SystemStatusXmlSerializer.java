package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class SystemStatusXmlSerializer implements IXmlSerializer<ISystemStatus> {

	private String name;

	public SystemStatusXmlSerializer() {
		this("SystemStatus");
	}

	public SystemStatusXmlSerializer(String name) {
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
	public ISystemStatus readObject(IXmlReader reader) {
		reader.startElement(getName());
		List<ISystemLoadAverage> param1 = reader.readObject(new ListSerializer<ISystemLoadAverage>("load", new SystemLoadAverageXmlSerializer("element")));
		List<ISystemDiskUsage> param2 = reader.readObject(new ListSerializer<ISystemDiskUsage>("disk", new SystemDiskUsageXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new SystemStatus(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISystemStatus object) {
		writer.startElement(getName());
		writer.writeObject(object.getLoad(), new ListSerializer<ISystemLoadAverage>("load", new SystemLoadAverageXmlSerializer("element")));
		writer.writeObject(object.getDisk(), new ListSerializer<ISystemDiskUsage>("disk", new SystemDiskUsageXmlSerializer("element")));
		writer.endElement(getName());
	}
}
