package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetSetupBeanListXmlSerializer implements IXmlSerializer<ISetSetupBeanList> {

	private String name;

	public SetSetupBeanListXmlSerializer() {
		this("SetSetupBeanList");
	}

	public SetSetupBeanListXmlSerializer(String name) {
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
	public ISetSetupBeanList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("xml"));
		reader.endElement(getName());

		// Create the bean
		return new SetSetupBeanList(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetSetupBeanList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getXml(), new StringSerializer("xml"));
		writer.endElement(getName());
	}
}
