package com.turnengine.client.api.local.alliance;

public interface IAllied {

	int getAllianceId();

	boolean hasAlliance();

	boolean isAlliedTo(IAllied allied);
}
