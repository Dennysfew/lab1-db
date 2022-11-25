package com.izhyk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Hotel {
    private Integer id;
    private String name;
    private Integer hotelsBranchId;
}
