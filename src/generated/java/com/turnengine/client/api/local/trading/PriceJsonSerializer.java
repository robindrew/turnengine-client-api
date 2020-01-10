package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class PriceJsonSerializer implements IJsonSerializer<IPrice> {

	private String name;

	public PriceJsonSerializer() {
		this("Price");
	}

	public PriceJsonSerializer(String name) {
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
	public IPrice readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IPrice object) {
		writer.openObject();
		writer.writeObject(object.getType(), new EnumSerializer<TradingType>(TradingType.class));
		writer.writeInt(object.getGoodsId());
		writer.writeLong(object.getGoodsAmount());
		writer.writeInt(object.getCurrencyId());
		writer.writeLong(object.getCurrencyAmount());
		writer.closeObject();
	}
}
