package com.turnengine.client.api.common.concept;

public enum GlobalConcept implements IGlobalConcept {

	/** The ADMIN constant. */
	ADMIN(ConceptType.GLOBAL),
	/** The ANNOUNCEMENT constant. */
	ANNOUNCEMENT(ConceptType.GLOBAL),
	/** The COMMON constant. */
	COMMON(ConceptType.GLOBAL),
	/** The ERROR constant. */
	ERROR(ConceptType.GLOBAL),
	/** The FORUM constant. */
	FORUM(ConceptType.GLOBAL),
	/** The GAME constant. */
	GAME(ConceptType.GLOBAL),
	/** The TRANSLATION constant. */
	TRANSLATION(ConceptType.GLOBAL),
	/** The USER constant. */
	USER(ConceptType.GLOBAL);

	/** The type field. */
	private final IConceptType type;

	private GlobalConcept(IConceptType type) {
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
