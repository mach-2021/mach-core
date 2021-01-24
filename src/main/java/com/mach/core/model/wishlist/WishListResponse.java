package com.mach.core.model.wishlist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class WishListResponse {
    private String id;
    @Singular
    private List<WishListItem> items;
}
