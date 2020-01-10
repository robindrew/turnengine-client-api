package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;

public class PlayerRankingXmlSerializer implements IXmlSerializer<IPlayerRanking> {

	private String name;

	public PlayerRankingXmlSerializer() {
		this("PlayerRanking");
	}

	public PlayerRankingXmlSerializer(String name) {
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
	public IPlayerRanking readObject(IXmlReader reader) {
		reader.startElement(getName());
		IPlayerInfo param1 = reader.readObject(new PlayerInfoXmlSerializer("player"));
		int param2 = reader.readInt("rank");
		long param3 = reader.readLong("score");
		reader.endElement(getName());

		// Create the bean
		return new PlayerRanking(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IPlayerRanking object) {
		writer.startElement(getName());
		writer.writeObject(object.getPlayer(), new PlayerInfoXmlSerializer("player"));
		writer.writeInt("rank", object.getRank());
		writer.writeLong("score", object.getScore());
		writer.endElement(getName());
	}
}
