package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class BuyGoodsAtLocationReturnTypeXmlSerializer implements IXmlSerializer<ITrade> {

	private String name;

	public BuyGoodsAtLocationReturnTypeXmlSerializer() {
		this("BuyGoodsAtLocationReturnType");
	}

	public BuyGoodsAtLocationReturnTypeXmlSerializer(String name) {
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
	public ITrade readObject(IXmlReader reader) {
		return new TradeXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITrade object) {
		new TradeXmlSerializer(getName()).writeObject(writer, object);
	}
}
