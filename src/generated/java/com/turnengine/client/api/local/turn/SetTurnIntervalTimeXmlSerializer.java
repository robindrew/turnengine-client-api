package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import java.util.concurrent.TimeUnit;

public class SetTurnIntervalTimeXmlSerializer implements IXmlSerializer<ISetTurnIntervalTime> {

	private String name;

	public SetTurnIntervalTimeXmlSerializer() {
		this("SetTurnIntervalTime");
	}

	public SetTurnIntervalTimeXmlSerializer(String name) {
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
	public ISetTurnIntervalTime readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		long param3 = reader.readLong("interval");
		TimeUnit param4 = reader.readObject(new EnumSerializer<TimeUnit>(TimeUnit.class, "unit"));
		reader.endElement(getName());

		// Create the bean
		return new SetTurnIntervalTime(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetTurnIntervalTime object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeLong("interval", object.getInterval());
		writer.writeObject(object.getUnit(), new EnumSerializer<TimeUnit>(TimeUnit.class, "unit"));
		writer.endElement(getName());
	}
}
