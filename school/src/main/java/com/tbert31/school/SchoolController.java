package com.tbert31.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody School school
    ){
        service.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAllSchools(){
        return ResponseEntity.ok(service.findAllSchools());
    }
}
