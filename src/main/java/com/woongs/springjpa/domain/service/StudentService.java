package com.woongs.springjpa.domain.service;

import com.woongs.springjpa.domain.entity.Student;
import com.woongs.springjpa.domain.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }
}
