package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGoodsPriceListAtLocationJsonSerializer implements IJsonSerializer<IGetGoodsPriceListAtLocation> {

	private String name;

	public GetGoodsPriceListAtLocationJsonSerializer() {
		this("GetGoodsPriceListAtLocation");
	}

	public GetGoodsPriceListAtLocationJsonSerializer(String name) {
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
	public IGetGoodsPriceListAtLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGoodsPriceListAtLocation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.closeObject();
	}
}
