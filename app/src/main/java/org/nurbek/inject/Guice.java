package org.nurbek.inject;

public class Guice {
    public static Injector createInjector(AbstractModule module) {
        return new Injector(module.map);
    }
}
