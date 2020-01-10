package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class GetUserSimilarityListReturnTypeXmlSerializer implements IXmlSerializer<List<IUserSimilarity>> {

	private String name;

	public GetUserSimilarityListReturnTypeXmlSerializer() {
		this("GetUserSimilarityListReturnType");
	}

	public GetUserSimilarityListReturnTypeXmlSerializer(String name) {
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
	public List<IUserSimilarity> readObject(IXmlReader reader) {
		return new ListSerializer<IUserSimilarity>(getName(), new UserSimilarityXmlSerializer("element")).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, List<IUserSimilarity> object) {
		new ListSerializer<IUserSimilarity>(getName(), new UserSimilarityXmlSerializer("element")).writeObject(writer, object);
	}
}
