package com.sdacademy.university.controller;

import com.sdacademy.university.model.entity.UniversityEntity;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {

    @GetMapping
    public List<UniversityEntity> getUniversities() {
        // TBD: complete implementation
        return null;
    }
}
