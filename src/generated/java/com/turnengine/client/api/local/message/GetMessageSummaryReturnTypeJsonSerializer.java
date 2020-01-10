package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetMessageSummaryReturnTypeJsonSerializer implements IJsonSerializer<IMessageSummary> {

	private String name;

	public GetMessageSummaryReturnTypeJsonSerializer() {
		this("GetMessageSummaryReturnType");
	}

	public GetMessageSummaryReturnTypeJsonSerializer(String name) {
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
	public IMessageSummary readObject(IJsonReader reader) {
		return new MessageSummaryJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IMessageSummary object) {
		new MessageSummaryJsonSerializer().writeObject(writer, object);
	}
}
