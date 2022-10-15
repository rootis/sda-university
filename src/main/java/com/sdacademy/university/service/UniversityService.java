package com.sdacademy.university.service;

import com.sdacademy.university.model.entity.UniversityEntity;
import com.sdacademy.university.repository.LecturerRepository;
import com.sdacademy.university.repository.UniversityRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    private final LecturerRepository lecturerRepository;
    private final UniversityRepository universityRepository;


    public UniversityService(LecturerRepository lecturerRepository, UniversityRepository universityRepository) {
        this.lecturerRepository = lecturerRepository;
        this.universityRepository = universityRepository;
    }

    public List<UniversityEntity> getUniversities() {
        return universityRepository.getUniversities();
    }

    public List<UniversityEntity> getUniversitiesWithLecturers() {
        var universities = universityRepository.getUniversities();
        var lecturers = lecturerRepository.getLecturers();

        universities.forEach(university -> lecturers.forEach(lecturer -> {
            if (university.getId().equals(lecturer.getUniversityId())) {
                if (university.getLecturers() == null) {
                    university.setLecturers(new ArrayList<>());
                }
                university.getLecturers().add(lecturer);
            }
        }));

        return universities;
    }
}
