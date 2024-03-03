package com.woongs.springjpa.domain.service;

import com.woongs.springjpa.domain.entity.School;
import com.woongs.springjpa.domain.repository.SchoolRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public Optional<School> findById(Long schoolId) {
        return schoolRepository.findById(schoolId);
    }
}
