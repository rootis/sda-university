package com.sdacademy.university.validator;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.sdacademy.university.model.entity.LecturerEntity;
import com.sdacademy.university.model.exception.ValidationException;
import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LecturerValidatorTest {

    private LecturerValidator lecturerValidator;

    @BeforeEach
    void init() {
        lecturerValidator = new LecturerValidator();
    }

    @Test
    void isValid() {
        var lecturer = LecturerEntity.builder()
            .name("Test")
            .salary(new BigDecimal("1000"))
            .age(22)
            .build();

        var result = lecturerValidator.isValid(lecturer);

        assertTrue(result);
    }

    @Test
    void isValid_invalidAge() {
        var lecturer = LecturerEntity.builder()
            .name("Test")
            .salary(new BigDecimal("1000"))
            .age(17)
            .build();

        assertThrows(ValidationException.class, () -> lecturerValidator.isValid(lecturer));
    }
}
