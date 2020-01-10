package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetGoodsPriceListAtLocationReturnTypeXmlSerializer implements IXmlSerializer<List<IPrice>> {

	private String name;

	public GetGoodsPriceListAtLocationReturnTypeXmlSerializer() {
		this("GetGoodsPriceListAtLocationReturnType");
	}

	public GetGoodsPriceListAtLocationReturnTypeXmlSerializer(String name) {
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
	public List<IPrice> readObject(IXmlReader reader) {
		return new ListSerializer<IPrice>(getName(), new PriceXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IPrice> object) {
		new ListSerializer<IPrice>(getName(), new PriceXmlSerializer("element")).writeObject(writer, object);
	}
}
