package org.nurbek.inject;

import java.util.Map;
import java.util.HashMap;

public abstract class AbstractModule {
    public final Map<Class<?>, Class<?>> map = new HashMap<>();

    protected AbstractModule() {
        this.configure();
    }

    public void configure() {
        // Should be overwritten
    }

    public void bind(Class<?> clazz, Class<?> to) {
        this.map.put(clazz, to);
    }
}
