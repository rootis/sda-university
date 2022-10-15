package com.sdacademy.university.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UniversityEntity {

    private String code;
    private String title;

    protected boolean canEqual(final Object other) {
        return other instanceof UniversityEntity;
    }
}
