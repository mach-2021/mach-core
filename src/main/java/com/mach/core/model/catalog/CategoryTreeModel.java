package com.mach.core.model.catalog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CategoryTreeModel {
    private String id;
    private String name;
    @Singular
    private List<CategoryTreeModel> children;
}
