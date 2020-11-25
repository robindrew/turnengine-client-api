package com.turnengine.client.api.local.action;

import static com.turnengine.client.api.local.action.ActionConditionExecute.START;
import static com.turnengine.client.api.local.action.ActionTargetType.SOURCE;
import static com.turnengine.client.api.local.action.ActionTargetType.TARGET;
import static com.turnengine.client.api.local.creation.CreationConditionType.FINISH_MOVEMENT;
import static com.turnengine.client.api.local.creation.CreationConditionType.START_MOVEMENT;
import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.turnengine.client.api.local.unit.IUnitIdContainer;

public class ActionDefinition implements IActionDefinition, IUnitIdContainer {

	private final IAction action;

	private volatile IActionTarget source = null;
	private volatile IActionTarget target = null;
	private volatile boolean movement = false;

	private final List<IActionCondition> list = new CopyOnWriteArrayList<IActionCondition>();

	private final List<IActionCondition> sourceList = new CopyOnWriteArrayList<IActionCondition>();
	private final List<IActionCondition> sourceStartList = new CopyOnWriteArrayList<IActionCondition>();
	private final List<IActionCondition> sourceFinishList = new CopyOnWriteArrayList<IActionCondition>();

	private final List<IActionCondition> targetList = new CopyOnWriteArrayList<IActionCondition>();
	private final List<IActionCondition> targetStartList = new CopyOnWriteArrayList<IActionCondition>();
	private final List<IActionCondition> targetFinishList = new CopyOnWriteArrayList<IActionCondition>();

	public ActionDefinition(IAction action) {
		this.action = action;
	}

	@Override
	public int getUnitId() {
		return getAction().getId();
	}

	@Override
	public IAction getAction() {
		return action;
	}

	@Override
	public IActionTarget getSource() {
		return source;
	}

	@Override
	public boolean hasSource() {
		return source != null;
	}

	@Override
	public IActionTarget getTarget() {
		return target;
	}

	@Override
	public boolean hasTarget() {
		return target != null;
	}

	@Override
	public List<IActionCondition> getConditions() {
		return list;
	}

	@Override
	public void setSource(IActionTarget source) {
		if (source.getId() != getAction().getId()) {
			throw new IllegalArgumentException("source=" + source + ", action=" + getAction());
		}
		if (!source.getTargetType().equals(SOURCE)) {
			throw new IllegalArgumentException("source=" + source + ", action=" + getAction());
		}
		this.source = source;
	}

	@Override
	public void setTarget(IActionTarget target) {
		if (source == null) {
			throw new IllegalStateException("source not set (mandatory)");
		}
		if (target.getId() != getAction().getId()) {
			throw new IllegalArgumentException("target=" + target + ", action=" + getAction());
		}
		if (!target.getTargetType().equals(TARGET)) {
			throw new IllegalArgumentException("target=" + target + ", action=" + getAction());
		}
		this.target = target;
	}

	@Override
	public void addCondition(IActionCondition condition) {
		if (source == null) {
			throw new IllegalStateException("source not set (mandatory)");
		}
		if (condition.getId() != getAction().getId()) {
			throw new IllegalArgumentException("condition=" + condition + ", action=" + getAction());
		}

		list.add(condition);

		// Movement?
		if (condition.getConditionType().equals(START_MOVEMENT)) {
			movement = true;
		}
		if (condition.getConditionType().equals(FINISH_MOVEMENT)) {
			movement = true;
		}

		// Source
		if (condition.getTarget().equals(SOURCE)) {
			sourceList.add(condition);
			if (condition.getExecute().equals(START)) {
				sourceStartList.add(condition);
			} else {
				sourceFinishList.add(condition);
			}
		}

		// Target
		else {
			targetList.add(condition);
			if (condition.getExecute().equals(START)) {
				targetStartList.add(condition);
			} else {
				targetFinishList.add(condition);
			}
		}
	}

	@Override
	public List<IActionCondition> getConditions(ActionTargetType type, ActionConditionExecute execute) {
		if (type.equals(SOURCE)) {
			return execute.equals(START) ? sourceStartList : sourceFinishList;
		} else {
			return execute.equals(START) ? targetStartList : targetFinishList;
		}
	}

	@Override
	public List<IActionCondition> getConditions(ActionTargetType type) {
		if (type.equals(SOURCE)) {
			return sourceList;
		} else {
			return targetList;
		}
	}

	@Override
	public boolean isInstant() {
		return getAction().getTurns() < 1;
	}

	@Override
	public int hashCode() {
		return action.getId();
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof ActionDefinition) {
			ActionDefinition that = (ActionDefinition) object;
			return this.getUnitId() == that.getUnitId();
		}
		return false;
	}

	@Override
	public String toString() {
		return reflectionToString(this, SHORT_PREFIX_STYLE);
	}

	@Override
	public boolean isMovement() {
		return movement;
	}

}
