package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class BuyGoodsAtLocationReturnTypeJsonSerializer implements IJsonSerializer<ITrade> {

	private String name;

	public BuyGoodsAtLocationReturnTypeJsonSerializer() {
		this("BuyGoodsAtLocationReturnType");
	}

	public BuyGoodsAtLocationReturnTypeJsonSerializer(String name) {
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
	public ITrade readObject(IJsonReader reader) {
		return new TradeJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, ITrade object) {
		new TradeJsonSerializer().writeObject(writer, object);
	}
}
