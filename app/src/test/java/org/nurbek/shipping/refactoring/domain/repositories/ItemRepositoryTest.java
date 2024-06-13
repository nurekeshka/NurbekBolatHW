package org.nurbek.shipping.refactoring.domain.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import org.nurbek.inject.Guice;
import org.nurbek.inject.Injector;

import org.nurbek.shipping.domain.enums.ItemEnum;
import org.nurbek.shipping.domain.models.Item;
import org.nurbek.shipping.domain.repositories.ItemRepository;
import org.nurbek.shipping.refactoring.application.initialization.BasicModule;

public class ItemRepositoryTest {
    private Injector injector;
    private ItemRepository itemRepository;

    @Before
    public void init() {
        this.injector = Guice.createInjector(new BasicModule());
        this.itemRepository = injector.getInstance(ItemRepository.class);
    }

    @Test
    public void getItem() {
        Item item = this.itemRepository.getItem(ItemEnum.DESKTOP);
        assertNotNull(item);
    }
}
