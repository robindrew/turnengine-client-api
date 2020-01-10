package com.turnengine.client.api.executable.type;

import static com.robindrew.common.lang.reflect.field.Fields.isStatic;

import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.common.text.parser.StringParserMap;
import com.robindrew.common.util.Check;
import com.robindrew.common.util.Java;

public class ExecutableBeanField {

	private static final Logger log = LoggerFactory.getLogger(ExecutableBeanField.class);

	public static final <R> Set<ExecutableBeanField> getFields(Class<? extends IExecutableBean<R>> type) {
		Set<ExecutableBeanField> set = new LinkedHashSet<>();
		for (Field field : type.getDeclaredFields()) {
			if (!isStatic(field)) {
				set.add(new ExecutableBeanField(field));
			}
		}
		return set;
	}

	private final Field field;

	public ExecutableBeanField(Field field) {
		this.field = Check.notNull("field", field);

	}

	public String getName() {
		return field.getName();
	}

	public Class<?> getType() {
		return field.getType();
	}

	public Object parseValue(String value) {
		try {
			StringParserMap map = new StringParserMap();
			return map.parse(field.getType(), value);
		} catch (Exception e) {
			log.error("Failed to parse field '" + field.getName() + "' (" + field.getType().getName() + ") from text: '" + value + "'");
			throw Java.propagate(e);
		}
	}

}
