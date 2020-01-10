package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SellGoodsAtLocationXmlSerializer implements IXmlSerializer<ISellGoodsAtLocation> {

	private String name;

	public SellGoodsAtLocationXmlSerializer() {
		this("SellGoodsAtLocation");
	}

	public SellGoodsAtLocationXmlSerializer(String name) {
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
	public ISellGoodsAtLocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("locationId");
		int param4 = reader.readInt("goodsId");
		long param5 = reader.readLong("goodsAmount");
		int param6 = reader.readInt("currencyId");
		reader.endElement(getName());

		// Create the bean
		return new SellGoodsAtLocation(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISellGoodsAtLocation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("locationId", object.getLocationId());
		writer.writeInt("goodsId", object.getGoodsId());
		writer.writeLong("goodsAmount", object.getGoodsAmount());
		writer.writeInt("currencyId", object.getCurrencyId());
		writer.endElement(getName());
	}
}
