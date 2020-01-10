package com.turnengine.client.api.concept;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.concept.GlobalConcept;
import com.turnengine.client.api.common.concept.IConcept;
import com.turnengine.client.api.common.concept.IGlobalConcept;
import com.turnengine.client.api.common.concept.ILocalConcept;
import com.turnengine.client.api.common.concept.LocalConcept;

/**
 * WARNING: This class makes a lot of assumptions about package naming.
 */
public class ConceptResolver {

	@SuppressWarnings("unchecked")
	public <R> IConcept getConcept(IExecutableBean<R> bean) {
		return getConcept((Class<? extends IExecutableBean<R>>) bean.getClass());
	}

	public <R> IConcept getConcept(Class<? extends IExecutableBean<R>> type) {
		String packageName = type.getPackage().getName();
		if (packageName.contains(".global.")) {
			return getGlobalConcept(packageName);
		}
		if (packageName.contains(".local.")) {
			return getLocalConcept(packageName);
		}
		throw new IllegalArgumentException("type=" + type);
	}

	private ILocalConcept getLocalConcept(String packageName) {
		for (LocalConcept concept : LocalConcept.values()) {
			String suffix = "." + concept.name().toLowerCase().replace("_", "");
			if (packageName.endsWith(suffix)) {
				return concept;
			}
		}
		throw new IllegalArgumentException("packageName: '" + packageName + "'");
	}

	private IGlobalConcept getGlobalConcept(String packageName) {
		for (GlobalConcept concept : GlobalConcept.values()) {
			String suffix = "." + concept.name().toLowerCase().replace("_", "");
			if (packageName.endsWith(suffix)) {
				return concept;
			}
		}
		throw new IllegalArgumentException("packageName: '" + packageName + "'");
	}

}
