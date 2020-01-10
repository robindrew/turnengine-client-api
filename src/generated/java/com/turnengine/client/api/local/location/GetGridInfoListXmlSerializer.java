package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.IntArraySerializer;

public class GetGridInfoListXmlSerializer implements IXmlSerializer<IGetGridInfoList> {

	private String name;

	public GetGridInfoListXmlSerializer() {
		this("GetGridInfoList");
	}

	public GetGridInfoListXmlSerializer(String name) {
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
	public IGetGridInfoList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int[] param3 = reader.readObject(new IntArraySerializer("coordinates"));
		int param4 = reader.readInt("depth");
		reader.endElement(getName());

		// Create the bean
		return new GetGridInfoList(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGridInfoList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer("coordinates"));
		writer.writeInt("depth", object.getDepth());
		writer.endElement(getName());
	}
}
