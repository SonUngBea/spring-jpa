package com.woongs.springjpa.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
@Getter
@Entity
public class School {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "school", fetch = FetchType.EAGER)
    private List<Student> students;
}
