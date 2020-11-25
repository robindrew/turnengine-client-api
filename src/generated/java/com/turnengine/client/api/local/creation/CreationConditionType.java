package com.turnengine.client.api.local.creation;

public enum CreationConditionType {

	/** The ADD constant. */
	ADD,
	/** The ADD_FRACTION constant. */
	ADD_FRACTION,
	/** The ADD_PERCENT constant. */
	ADD_PERCENT,
	/** The REMOVE constant. */
	REMOVE,
	/** The REMOVE_FRACTION constant. */
	REMOVE_FRACTION,
	/** The REMOVE_PERCENT constant. */
	REMOVE_PERCENT,
	/** The EXISTS constant. */
	EXISTS,
	/** The NOT_EXISTS constant. */
	NOT_EXISTS,
	/** The MINIMUM_UPKEEP constant. */
	MINIMUM_UPKEEP,
	/** The MAXIMUM_UPKEEP constant. */
	MAXIMUM_UPKEEP,
	/** The OWN_LOCATION constant. */
	OWN_LOCATION,
	/** The SAME_LOCATION constant. */
	SAME_LOCATION,
	/** The MINIMUM_UPKEEP_REMOVE constant. */
	MINIMUM_UPKEEP_REMOVE,
	/** The ADD_RANDOM constant. */
	ADD_RANDOM,
	/** The REMOVE_RANDOM constant. */
	REMOVE_RANDOM,
	/** The MOVE_REGION constant. */
	MOVE_REGION,
	/** The START_MOVEMENT constant. */
	START_MOVEMENT,
	/** The FINISH_MOVEMENT constant. */
	FINISH_MOVEMENT,
	/** The START_WAITING constant. */
	START_WAITING,
	/** The FINISH_WAITING constant. */
	FINISH_WAITING;
}
