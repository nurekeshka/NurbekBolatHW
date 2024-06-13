package org.nurbek.inject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class Injector {
    private final Map<Class<?>, Class<?>> map;

    public Injector(Map<Class<?>, Class<?>> map) {
        this.map = map;
    }

    public <T> T getInstance(Class<T> type) {
        Class<?> clazz = this.map.get(type);

        if (clazz == null) {
            throw new IllegalArgumentException("No implementation registered for: " + type.getName());
        }

        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            Class<?>[] paramTypes = constructor.getParameterTypes();

            Object[] params = new Object[paramTypes.length];

            for (int i = 0; i < paramTypes.length; i++) {
                params[i] = this.getInstance(paramTypes[i]);
            }

            return type.cast(constructor.newInstance(params));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException
                | NoSuchMethodException e) {
            throw new InjectionException(e.toString() + " on the class : " + clazz.getName(), e);
        }
    }
}
