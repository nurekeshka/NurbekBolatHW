package org.nurbek.shipping.domain.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import org.nurbek.inject.Guice;
import org.nurbek.inject.Injector;
import org.nurbek.shipping.application.initialization.BasicModule;
import org.nurbek.shipping.domain.enums.ItemEnum;
import org.nurbek.shipping.domain.models.Item;

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
