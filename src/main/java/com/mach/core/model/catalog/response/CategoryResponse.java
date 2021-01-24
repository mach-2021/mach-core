package com.mach.core.model.catalog.response;

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
public class CategoryResponse<T> {
    @Singular
    private List<T> categories;
}
