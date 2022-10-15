package com.sdacademy.university.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UniversityEntity {

    private String code;
    private String title;
}
