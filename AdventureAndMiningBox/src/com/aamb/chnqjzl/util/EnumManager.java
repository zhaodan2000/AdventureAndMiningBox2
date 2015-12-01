package com.aamb.chnqjzl.util;

import java.util.HashMap;
import java.util.Map;

public class EnumManager {

	private static final Map<String, Enum<?>> enumMap = new HashMap<String, Enum<?>>();

	public static void regist(Enum<?> enums) {
		String key = enums.getClass().getName() + enums.toString();
		if (enumMap.containsKey(key))
			return;
		enumMap.put(key, enums);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getEnum(Class<T> enumType, String name) {
		String key = enumType.getName() + name;
		Enum<?> value = enumMap.get(key);
		if (null == value)
			return null;
		return (T) value;
	}

}
