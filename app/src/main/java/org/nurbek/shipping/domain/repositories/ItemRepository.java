package org.nurbek.shipping.domain.repositories;

import org.nurbek.shipping.domain.enums.ItemEnum;
import org.nurbek.shipping.domain.models.Item;

public interface ItemRepository {
    public Item getItem(ItemEnum type);
}
