package com.turnengine.client.api.common.concept;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class ConceptComparator implements Comparator<IConcept> {

	@Override
	public int compare(IConcept concept1, IConcept concept2) {
		CompareToBuilder compare = new CompareToBuilder();
		compare.append(concept1.getType(), concept2.getType());
		compare.append(concept1.name(), concept2.name());
		return compare.toComparison();
	}

}
