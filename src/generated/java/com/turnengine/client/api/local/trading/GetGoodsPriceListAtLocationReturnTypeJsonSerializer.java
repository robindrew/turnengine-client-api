package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetGoodsPriceListAtLocationReturnTypeJsonSerializer implements IJsonSerializer<List<IPrice>> {

	private String name;

	public GetGoodsPriceListAtLocationReturnTypeJsonSerializer() {
		this("GetGoodsPriceListAtLocationReturnType");
	}

	public GetGoodsPriceListAtLocationReturnTypeJsonSerializer(String name) {
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
	public List<IPrice> readObject(IJsonReader reader) {
		return new ListSerializer<IPrice>(new PriceJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IPrice> object) {
		new ListSerializer<IPrice>(new PriceJsonSerializer()).writeObject(writer, object);
	}
}
