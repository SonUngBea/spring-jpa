package com.woongs.springjpa.domain;

import com.woongs.springjpa.domain.entity.School;
import com.woongs.springjpa.domain.entity.Student;
import com.woongs.springjpa.domain.service.SchoolService;
import com.woongs.springjpa.domain.service.StudentService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Component
public class SampleCodeRunner {

    private final StudentService studentService;
    private final SchoolService schoolService;

    @PostConstruct
    public void setup() {
//        Optional<Student> student = studentService.findById(1L);
//        student.ifPresentOrElse(result -> log.info("student : {}", result), () -> log.info("can not find student"));
//
        Optional<School> schoolOptional = schoolService.findById(1L);
        schoolOptional.ifPresentOrElse(result -> log.info("school : {}", result), () -> log.info("can not find school"));
    }

}
