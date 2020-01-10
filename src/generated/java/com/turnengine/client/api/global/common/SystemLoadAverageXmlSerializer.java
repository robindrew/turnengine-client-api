package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class SystemLoadAverageXmlSerializer implements IXmlSerializer<ISystemLoadAverage> {

	private String name;

	public SystemLoadAverageXmlSerializer() {
		this("SystemLoadAverage");
	}

	public SystemLoadAverageXmlSerializer(String name) {
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
	public ISystemLoadAverage readObject(IXmlReader reader) {
		reader.startElement(getName());
		LoadAveragePeriod param1 = reader.readObject(new EnumSerializer<LoadAveragePeriod>(LoadAveragePeriod.class, "period"));
		double param2 = reader.readDouble("average");
		reader.endElement(getName());

		// Create the bean
		return new SystemLoadAverage(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISystemLoadAverage object) {
		writer.startElement(getName());
		writer.writeObject(object.getPeriod(), new EnumSerializer<LoadAveragePeriod>(LoadAveragePeriod.class, "period"));
		writer.writeDouble("average", object.getAverage());
		writer.endElement(getName());
	}
}
