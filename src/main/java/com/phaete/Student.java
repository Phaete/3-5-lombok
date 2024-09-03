package com.phaete;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class Student {
    private String id;
    private String name;
    private String address;
    private BigDecimal grade;

}
