package com.tbert31.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;

    public void saveSchool(School school){
        repository.save(school);
    }

    public List<School> findAllSchools(){
        return repository.findAll();
    }
}
