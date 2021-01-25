package com.mach.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductSearchModel {

    private String objectID;
    private String name;
    private String category;
    private String description;
    private String productCategory;
    private BigDecimal trending;
    private String picture;
    private String sku;
}
