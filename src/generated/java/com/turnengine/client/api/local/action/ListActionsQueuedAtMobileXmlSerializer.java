package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ListActionsQueuedAtMobileXmlSerializer implements IXmlSerializer<IListActionsQueuedAtMobile> {

	private String name;

	public ListActionsQueuedAtMobileXmlSerializer() {
		this("ListActionsQueuedAtMobile");
	}

	public ListActionsQueuedAtMobileXmlSerializer(String name) {
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
	public IListActionsQueuedAtMobile readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("mobileId");
		reader.endElement(getName());

		// Create the bean
		return new ListActionsQueuedAtMobile(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IListActionsQueuedAtMobile object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.endElement(getName());
	}
}
