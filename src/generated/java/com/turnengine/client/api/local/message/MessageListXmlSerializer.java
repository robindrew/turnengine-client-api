package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import java.util.List;

public class MessageListXmlSerializer implements IXmlSerializer<IMessageList> {

	private String name;

	public MessageListXmlSerializer() {
		this("MessageList");
	}

	public MessageListXmlSerializer(String name) {
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
	public IMessageList readObject(IXmlReader reader) {
		reader.startElement(getName());
		List<IMessage> param1 = reader.readObject(new ListSerializer<IMessage>("messageList", new MessageXmlSerializer("element")));
		int param2 = reader.readInt("total");
		reader.endElement(getName());

		// Create the bean
		return new MessageList(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMessageList object) {
		writer.startElement(getName());
		writer.writeObject(object.getMessageList(), new ListSerializer<IMessage>("messageList", new MessageXmlSerializer("element")));
		writer.writeInt("total", object.getTotal());
		writer.endElement(getName());
	}
}
