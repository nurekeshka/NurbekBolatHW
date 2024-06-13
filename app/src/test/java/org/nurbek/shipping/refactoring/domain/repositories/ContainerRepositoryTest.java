package org.nurbek.shipping.refactoring.domain.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import org.nurbek.inject.Guice;
import org.nurbek.inject.Injector;

import org.nurbek.shipping.domain.enums.ContainerType;
import org.nurbek.shipping.domain.models.Container;
import org.nurbek.shipping.domain.repositories.ContainerRepository;
import org.nurbek.shipping.refactoring.application.initialization.BasicModule;

public class ContainerRepositoryTest {
    private Injector injector;
    private ContainerRepository containerRepository;

    @Before
    public void init() {
        this.injector = Guice.createInjector(new BasicModule());
        this.containerRepository = injector.getInstance(ContainerRepository.class);
    }

    @Test
    public void getContainer() {
        Container container = this.containerRepository.getContainer(ContainerType.SMALL);
        assertNotNull(container);
    }
}
