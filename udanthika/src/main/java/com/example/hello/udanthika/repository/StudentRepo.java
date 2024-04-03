// package com.example.hello.udanthika.repository;

// import java.util.Optional;
// import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.hello.udanthika.model.Student;

// public interface StudentRepo extends JpaRepository<Student, Integer> { 
//     boolean existsByStudentId(int studentId);

//     Optional<Student> findByStudentId(int studentId);
//     void deleteByStudentId(int studentId);

//     Optional<Student> findByEmail(String email);
// }



package com.example.hello.udanthika.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hello.udanthika.model.Student;


public interface StudentRepo extends JpaRepository<Student, Long >{
    Optional<Student> findByEmail(String email);
    void deleteById(int Id);
}