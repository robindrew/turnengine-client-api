package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.array.IntArraySerializer;

public class GetGridInfoListJsonSerializer implements IJsonSerializer<IGetGridInfoList> {

	private String name;

	public GetGridInfoListJsonSerializer() {
		this("GetGridInfoList");
	}

	public GetGridInfoListJsonSerializer(String name) {
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
	public IGetGridInfoList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGridInfoList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer());
		writer.writeInt(object.getDepth());
		writer.closeObject();
	}
}
