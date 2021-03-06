package com.mach.core.model.wishlist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WishListItem {
    private String objectID;
    private String name;
    private BigDecimal trending;
    private String picture;
    private String sku;
}
