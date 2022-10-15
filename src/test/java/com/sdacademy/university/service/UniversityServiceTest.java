package com.sdacademy.university.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.sdacademy.university.model.entity.UniversityEntity;
import com.sdacademy.university.repository.UniversityRepository;
import java.util.List;
import org.junit.jupiter.api.Test;

class UniversityServiceTest {

    @Test
    void getUniversities() {
        List<UniversityEntity> universities = List.of(
            UniversityEntity.builder()
                .code("TU")
                .title("Test University")
                .build()
        );
        var mockedUniversityRepository = mock(UniversityRepository.class);
        var universityService = new UniversityService(mockedUniversityRepository);
        when(mockedUniversityRepository.getUniversities()).thenReturn(universities);

        var result = universityService.getUniversities();

        assertEquals(universities, result);
    }
}
