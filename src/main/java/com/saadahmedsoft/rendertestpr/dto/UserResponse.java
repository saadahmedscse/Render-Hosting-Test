package com.saadahmedsoft.rendertestpr.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private long id;
    private String name;
    private String designation;
}
