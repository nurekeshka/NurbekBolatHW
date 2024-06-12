package org.nurbek.shipping.domain.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.nurbek.shipping.application.initialization.BasicModule;
import org.nurbek.shipping.domain.enums.SizeEnum;
import org.nurbek.shipping.domain.models.Size;

import com.google.inject.Guice;
import com.google.inject.Injector;

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
