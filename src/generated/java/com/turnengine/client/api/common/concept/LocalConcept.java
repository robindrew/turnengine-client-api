package com.turnengine.client.api.common.concept;

public enum LocalConcept implements ILocalConcept {

	/** The ACTION constant. */
	ACTION(ConceptType.LOCAL),
	/** The ALLIANCE constant. */
	ALLIANCE(ConceptType.LOCAL),
	/** The ALLIANCE_FORUM constant. */
	ALLIANCE_FORUM(ConceptType.LOCAL),
	/** The ERROR constant. */
	ERROR(ConceptType.LOCAL),
	/** The FACTION constant. */
	FACTION(ConceptType.LOCAL),
	/** The GAME constant. */
	GAME(ConceptType.LOCAL),
	/** The GROUP constant. */
	GROUP(ConceptType.LOCAL),
	/** The LOCATION constant. */
	LOCATION(ConceptType.LOCAL),
	/** The MESSAGE constant. */
	MESSAGE(ConceptType.LOCAL),
	/** The MOBILE constant. */
	MOBILE(ConceptType.LOCAL),
	/** The PLAYER constant. */
	PLAYER(ConceptType.LOCAL),
	/** The PROPERTY constant. */
	PROPERTY(ConceptType.LOCAL),
	/** The SCORE constant. */
	SCORE(ConceptType.LOCAL),
	/** The SETUP constant. */
	SETUP(ConceptType.LOCAL),
	/** The STORAGE constant. */
	STORAGE(ConceptType.LOCAL),
	/** The TRADING constant. */
	TRADING(ConceptType.LOCAL),
	/** The TURN constant. */
	TURN(ConceptType.LOCAL),
	/** The UNIT constant. */
	UNIT(ConceptType.LOCAL),
	/** The UPKEEP constant. */
	UPKEEP(ConceptType.LOCAL);

	/** The type field. */
	private final IConceptType type;

	private LocalConcept(IConceptType type) {
		this.type = type;
	}

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	public IConceptType getType() {
		return type;
	}
}
