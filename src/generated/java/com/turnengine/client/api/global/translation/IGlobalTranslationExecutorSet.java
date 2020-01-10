package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.robindrew.common.locale.LanguageCountry;
import com.turnengine.client.api.common.command.IGlobalBeanExecutorSet;

public interface IGlobalTranslationExecutorSet extends IBeanExecutorSet, IGlobalBeanExecutorSet {

	Integer newTranslation(long loginId, String english);

	Integer setTranslation(long loginId, int id, LanguageCountry language, String translation);

	ITranslation getTranslationById(int id, LanguageCountry language);

	ITranslation getTranslationByText(String english, LanguageCountry language);
}
