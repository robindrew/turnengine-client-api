package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class TradeXmlSerializer implements IXmlSerializer<ITrade> {

	private String name;

	public TradeXmlSerializer() {
		this("Trade");
	}

	public TradeXmlSerializer(String name) {
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
		reader.startElement(getName());
		TradingType param1 = reader.readObject(new EnumSerializer<TradingType>(TradingType.class, "type"));
		int param2 = reader.readInt("goodsId");
		long param3 = reader.readLong("goodsAmount");
		int param4 = reader.readInt("currencyId");
		long param5 = reader.readLong("currencyAmount");
		reader.endElement(getName());

		// Create the bean
		return new Trade(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITrade object) {
		writer.startElement(getName());
		writer.writeObject(object.getType(), new EnumSerializer<TradingType>(TradingType.class, "type"));
		writer.writeInt("goodsId", object.getGoodsId());
		writer.writeLong("goodsAmount", object.getGoodsAmount());
		writer.writeInt("currencyId", object.getCurrencyId());
		writer.writeLong("currencyAmount", object.getCurrencyAmount());
		writer.endElement(getName());
	}
}
