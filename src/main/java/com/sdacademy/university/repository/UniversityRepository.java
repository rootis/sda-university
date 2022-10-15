package com.sdacademy.university.repository;

import com.sdacademy.university.model.entity.UniversityEntity;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UniversityRepository {

    private List<UniversityEntity> universities = List.of(
        UniversityEntity.builder()
            .id(1L)
            .code("KTU")
            .title("Kaunas Technology University")
            .build(),
        UniversityEntity.builder()
            .id(2L)
            .code("VU")
            .title("Vilnius University")
            .build()
    );

    public List<UniversityEntity> getUniversities() {
        return universities;
    }
}
