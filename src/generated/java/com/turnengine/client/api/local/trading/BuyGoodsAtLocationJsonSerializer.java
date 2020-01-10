package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class BuyGoodsAtLocationJsonSerializer implements IJsonSerializer<IBuyGoodsAtLocation> {

	private String name;

	public BuyGoodsAtLocationJsonSerializer() {
		this("BuyGoodsAtLocation");
	}

	public BuyGoodsAtLocationJsonSerializer(String name) {
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
	public IBuyGoodsAtLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IBuyGoodsAtLocation object) {
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
