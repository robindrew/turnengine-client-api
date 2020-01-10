package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class UserSimilarityXmlSerializer implements IXmlSerializer<IUserSimilarity> {

	private String name;

	public UserSimilarityXmlSerializer() {
		this("UserSimilarity");
	}

	public UserSimilarityXmlSerializer(String name) {
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
	public IUserSimilarity readObject(IXmlReader reader) {
		reader.startElement(getName());
		IUser param1 = reader.readObject(new UserXmlSerializer("user1"));
		IUser param2 = reader.readObject(new UserXmlSerializer("user2"));
		int param3 = reader.readInt("nameScore");
		int param4 = reader.readInt("emailScore");
		int param5 = reader.readInt("addressScore");
		int param6 = reader.readInt("passwordScore");
		reader.endElement(getName());

		// Create the bean
		return new UserSimilarity(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUserSimilarity object) {
		writer.startElement(getName());
		writer.writeObject(object.getUser1(), new UserXmlSerializer("user1"));
		writer.writeObject(object.getUser2(), new UserXmlSerializer("user2"));
		writer.writeInt("nameScore", object.getNameScore());
		writer.writeInt("emailScore", object.getEmailScore());
		writer.writeInt("addressScore", object.getAddressScore());
		writer.writeInt("passwordScore", object.getPasswordScore());
		writer.endElement(getName());
	}
}
