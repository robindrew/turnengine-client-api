package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ClearMobileQueueXmlSerializer implements IXmlSerializer<IClearMobileQueue> {

	private String name;

	public ClearMobileQueueXmlSerializer() {
		this("ClearMobileQueue");
	}

	public ClearMobileQueueXmlSerializer(String name) {
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
	public IClearMobileQueue readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		reader.endElement(getName());

		// Create the bean
		return new ClearMobileQueue(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IClearMobileQueue object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.endElement(getName());
	}
}
