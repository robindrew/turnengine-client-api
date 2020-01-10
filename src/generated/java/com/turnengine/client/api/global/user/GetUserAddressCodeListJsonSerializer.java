package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetUserAddressCodeListJsonSerializer implements IJsonSerializer<IGetUserAddressCodeList> {

	private String name;

	public GetUserAddressCodeListJsonSerializer() {
		this("GetUserAddressCodeList");
	}

	public GetUserAddressCodeListJsonSerializer(String name) {
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
	public IGetUserAddressCodeList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserAddressCodeList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getUserId());
		writer.writeObject(object.getCode(), new StringSerializer());
		writer.closeObject();
	}
}
