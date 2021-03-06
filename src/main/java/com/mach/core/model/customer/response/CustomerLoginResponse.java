package com.mach.core.model.customer.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CustomerLoginResponse {
    private String id;
    private String email;
    private String name;
}
