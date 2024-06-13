package org.nurbek.shipping.domain.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.nurbek.inject.Guice;
import org.nurbek.inject.Injector;
import org.nurbek.shipping.application.initialization.BasicModule;
import org.nurbek.shipping.domain.enums.SizeEnum;
import org.nurbek.shipping.domain.models.Size;

public class SizeRepositoryTest {
    private Injector injector;
    private SizeRepository sizeRepository;

    @Before
    public void init() {
        this.injector = Guice.createInjector(new BasicModule());
        this.sizeRepository = injector.getInstance(SizeRepository.class);
    }

    @Test
    public void getSize() {
        Size size = sizeRepository.getSize(SizeEnum.SMALL_CONTAINER);
        assertNotNull(size);
    }
}
