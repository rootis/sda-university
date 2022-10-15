package com.sdacademy.university.service;

import com.sdacademy.university.model.entity.UniversityEntity;
import com.sdacademy.university.repository.UniversityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public List<UniversityEntity> getUniversities() {
        return universityRepository.getUniversities();
    }
}
