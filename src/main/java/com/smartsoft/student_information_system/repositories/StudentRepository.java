/*
 * Copyright (c) 2019. SmartSoft
 */

package com.smartsoft.student_information_system.repositories;

import com.smartsoft.student_information_system.models.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "student", path = "students")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

    List<Student> findAll();

    List<Student> findByStudentId(@Param("studentId") Long studentId);

    List<Student> findByLastName(@Param("lastName") String lastName);

    List<Student> findByFirstName(@Param("firstName") String firstName);
}
