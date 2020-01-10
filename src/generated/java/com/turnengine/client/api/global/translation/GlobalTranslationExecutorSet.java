package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.robindrew.common.locale.LanguageCountry;

public class GlobalTranslationExecutorSet implements IGlobalTranslationExecutorSet {

	private final IBeanExecutorLocator locator;

	public GlobalTranslationExecutorSet(IBeanExecutorLocator locator) {
		if (locator == null) {
			throw new NullPointerException("locator");
		}
		this.locator = locator;
	}

	/**
	 * Getter for the locator field.
	 * @return the value of the locator field.
	 */
	public IBeanExecutorLocator getLocator() {
		return locator;
	}

	@Override
	public Integer newTranslation(long loginId, String english) {
		NewTranslation bean = new NewTranslation(loginId, english);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Integer setTranslation(long loginId, int id, LanguageCountry language, String translation) {
		SetTranslation bean = new SetTranslation(loginId, id, language, translation);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public ITranslation getTranslationById(int id, LanguageCountry language) {
		GetTranslationById bean = new GetTranslationById(id, language);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public ITranslation getTranslationByText(String english, LanguageCountry language) {
		GetTranslationByText bean = new GetTranslationByText(english, language);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
