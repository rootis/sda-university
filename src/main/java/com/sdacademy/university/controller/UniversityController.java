package com.sdacademy.university.controller;

import com.sdacademy.university.model.entity.UniversityEntity;
import com.sdacademy.university.service.UniversityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping
    public List<UniversityEntity> getUniversities() {
        return universityService.getUniversities();
    }

    @GetMapping("/with-lecturers")
    public List<UniversityEntity> getUniversitiesWithLecturers() {
        return universityService.getUniversitiesWithLecturers();
    }
}
