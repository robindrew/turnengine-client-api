package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SellGoodsAtLocationJsonSerializer implements IJsonSerializer<ISellGoodsAtLocation> {

	private String name;

	public SellGoodsAtLocationJsonSerializer() {
		this("SellGoodsAtLocation");
	}

	public SellGoodsAtLocationJsonSerializer(String name) {
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
	public ISellGoodsAtLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISellGoodsAtLocation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getGoodsId());
		writer.writeLong(object.getGoodsAmount());
		writer.writeInt(object.getCurrencyId());
		writer.closeObject();
	}
}
