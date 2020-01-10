package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ProcessInfoXmlSerializer implements IXmlSerializer<IProcessInfo> {

	private String name;

	public ProcessInfoXmlSerializer() {
		this("ProcessInfo");
	}

	public ProcessInfoXmlSerializer(String name) {
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
	public IProcessInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		IProjectInfo param3 = reader.readObject(new ProjectInfoXmlSerializer("project"));
		IServiceInfo param4 = reader.readObject(new ServiceInfoXmlSerializer("service"));
		IReleaseInfo param5 = reader.readObject(new ReleaseInfoXmlSerializer("release"));
		int param6 = reader.readInt("port");
		reader.endElement(getName());

		// Create the bean
		return new ProcessInfo(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IProcessInfo object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getProject(), new ProjectInfoXmlSerializer("project"));
		writer.writeObject(object.getService(), new ServiceInfoXmlSerializer("service"));
		writer.writeObject(object.getRelease(), new ReleaseInfoXmlSerializer("release"));
		writer.writeInt("port", object.getPort());
		writer.endElement(getName());
	}
}
