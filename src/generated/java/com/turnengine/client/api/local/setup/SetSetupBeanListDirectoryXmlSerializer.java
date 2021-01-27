package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetSetupBeanListDirectoryXmlSerializer implements IXmlSerializer<ISetSetupBeanListDirectory> {

	private String name;

	public SetSetupBeanListDirectoryXmlSerializer() {
		this("SetSetupBeanListDirectory");
	}

	public SetSetupBeanListDirectoryXmlSerializer(String name) {
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
	public ISetSetupBeanListDirectory readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("directory"));
		String param4 = reader.readObject(new StringSerializer("filenames"));
		reader.endElement(getName());

		// Create the bean
		return new SetSetupBeanListDirectory(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetSetupBeanListDirectory object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getDirectory(), new StringSerializer("directory"));
		writer.writeObject(object.getFilenames(), new StringSerializer("filenames"));
		writer.endElement(getName());
	}
}
