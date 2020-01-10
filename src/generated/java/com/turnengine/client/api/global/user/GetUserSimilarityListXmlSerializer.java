package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class GetUserSimilarityListXmlSerializer implements IXmlSerializer<IGetUserSimilarityList> {

	private String name;

	public GetUserSimilarityListXmlSerializer() {
		this("GetUserSimilarityList");
	}

	public GetUserSimilarityListXmlSerializer(String name) {
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
	public IGetUserSimilarityList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		UserSimilarityOrder param2 = reader.readObject(new EnumSerializer<UserSimilarityOrder>(UserSimilarityOrder.class, "order"));
		int param3 = reader.readInt("threshold");
		int param4 = reader.readInt("pageNumber");
		int param5 = reader.readInt("pageSize");
		reader.endElement(getName());

		// Create the bean
		return new GetUserSimilarityList(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUserSimilarityList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getOrder(), new EnumSerializer<UserSimilarityOrder>(UserSimilarityOrder.class, "order"));
		writer.writeInt("threshold", object.getThreshold());
		writer.writeInt("pageNumber", object.getPageNumber());
		writer.writeInt("pageSize", object.getPageSize());
		writer.endElement(getName());
	}
}
