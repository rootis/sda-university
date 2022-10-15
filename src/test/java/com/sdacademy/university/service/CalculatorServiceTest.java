package com.sdacademy.university.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void init() {
        calculatorService = new CalculatorService();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "2,7,9", "11,20,31"})
    void add(Integer a, Integer b, Integer c) {
        var result = calculatorService.add(a, b);

        assertEquals(c, result);
    }
}
