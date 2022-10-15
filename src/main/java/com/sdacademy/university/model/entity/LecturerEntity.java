package com.sdacademy.university.model.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LecturerEntity {

    private Long id;
    private String name;
    private Integer age;
    private BigDecimal salary;
    private Long universityId;
}
