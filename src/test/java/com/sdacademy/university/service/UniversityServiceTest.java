package com.sdacademy.university.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.sdacademy.university.model.entity.LecturerEntity;
import com.sdacademy.university.model.entity.UniversityEntity;
import com.sdacademy.university.repository.LecturerRepository;
import com.sdacademy.university.repository.UniversityRepository;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UniversityServiceTest {

    private LecturerRepository mockedLecturerRepository;
    private UniversityRepository mockedUniversityRepository;
    private UniversityService universityService;

    @BeforeEach
    void init() {
        mockedLecturerRepository = mock(LecturerRepository.class);
        mockedUniversityRepository = mock(UniversityRepository.class);
        universityService = new UniversityService(mockedLecturerRepository, mockedUniversityRepository);
    }

    @Test
    void getUniversities() {
        var universities = generateUniversities();
        when(mockedUniversityRepository.getUniversities()).thenReturn(universities);

        var result = universityService.getUniversities();

        assertEquals(universities, result);
    }

    @Test
    void getUniversitiesWithLecturers() {
        var universities = generateUniversities();
        var lecturers = generateLecturers();
        // Define that mocked repos should return that data

        // Execute - call service method

        // Assert - verify the result
    }

    private List<UniversityEntity> generateUniversities() {
        return List.of(
            UniversityEntity.builder()
                .id(1L)
                .code("TU")
                .title("Test University")
                .build(),
            UniversityEntity.builder()
                .id(2L)
                .code("TU2")
                .title("Test University 2")
                .build()
        );
    }

    private List<LecturerEntity> generateLecturers() {
        return List.of(
            LecturerEntity.builder()
                .id(1L)
                .name("Test")
                .salary(new BigDecimal("1000"))
                .age(35)
                .universityId(1L)
                .build(),
            LecturerEntity.builder()
                .id(2L)
                .name("Test2")
                .salary(new BigDecimal("1100"))
                .age(37)
                .universityId(2L)
                .build(),
            LecturerEntity.builder()
                .id(3L)
                .name("Test3")
                .salary(new BigDecimal("900"))
                .age(39)
                .universityId(1L)
                .build()
        );
    }
}
