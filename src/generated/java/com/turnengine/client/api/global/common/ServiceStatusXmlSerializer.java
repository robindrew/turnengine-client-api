package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ServiceStatusXmlSerializer implements IXmlSerializer<IServiceStatus> {

	private String name;

	public ServiceStatusXmlSerializer() {
		this("ServiceStatus");
	}

	public ServiceStatusXmlSerializer(String name) {
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
	public IServiceStatus readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("service"));
		String param2 = reader.readObject(new StringSerializer("release"));
		long param3 = reader.readLong("memory");
		double param4 = reader.readDouble("heap");
		double param5 = reader.readDouble("perm");
		double param6 = reader.readDouble("cpu");
		int param7 = reader.readInt("cpuCount");
		int param8 = reader.readInt("threads");
		int param9 = reader.readInt("classes");
		long param10 = reader.readLong("exceptions");
		long param11 = reader.readLong("started");
		long param12 = reader.readLong("uptime");
		String param13 = reader.readObject(new StringSerializer("user"));
		String param14 = reader.readObject(new StringSerializer("host"));
		String param15 = reader.readObject(new StringSerializer("address"));
		long param16 = reader.readLong("process");
		reader.endElement(getName());

		// Create the bean
		return new ServiceStatus(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16);
	}

	@Override
	public void writeObject(IXmlWriter writer, IServiceStatus object) {
		writer.startElement(getName());
		writer.writeObject(object.getService(), new StringSerializer("service"));
		writer.writeObject(object.getRelease(), new StringSerializer("release"));
		writer.writeLong("memory", object.getMemory());
		writer.writeDouble("heap", object.getHeap());
		writer.writeDouble("perm", object.getPerm());
		writer.writeDouble("cpu", object.getCpu());
		writer.writeInt("cpuCount", object.getCpuCount());
		writer.writeInt("threads", object.getThreads());
		writer.writeInt("classes", object.getClasses());
		writer.writeLong("exceptions", object.getExceptions());
		writer.writeLong("started", object.getStarted());
		writer.writeLong("uptime", object.getUptime());
		writer.writeObject(object.getUser(), new StringSerializer("user"));
		writer.writeObject(object.getHost(), new StringSerializer("host"));
		writer.writeObject(object.getAddress(), new StringSerializer("address"));
		writer.writeLong("process", object.getProcess());
		writer.endElement(getName());
	}
}
