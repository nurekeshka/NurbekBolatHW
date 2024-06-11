package org.nurbek.shipping.domain.repositories;

import org.nurbek.shipping.domain.enums.SizeEnum;
import org.nurbek.shipping.domain.models.Size;

public interface SizeRepository {
    public Size getSize(SizeEnum type);
}
