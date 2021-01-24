package com.mach.core.model.wishlist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WishListItem {
    private String productId;
    private String image;
    private String name;
    private String description;
}
