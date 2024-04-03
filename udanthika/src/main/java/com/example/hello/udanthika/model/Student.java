// package com.example.hello.udanthika.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;

// @Entity
// public class Student {
    
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int studentId;
//     private String studentName;
//     private String email;
    
//     public Student() {
//         // Required by JPA
//     }
    
//     public Student(int studentId, String studentName, String email) {
//         this.studentId = studentId;
//         this.studentName = studentName;
//         this.email = email;
//     }
    
//     public int getStudentId() {
//         return studentId;
//     }
    
//     public void setStudentId(int studentId) {
//         this.studentId = studentId;
//     }
    
//     public String getStudentName() {
//         return studentName;
//     }
    
//     public void setStudentName(String studentName) {
//         this.studentName = studentName;
//     }
    
//     public String getEmail() {
//         return email;
//     }
    
//     public void setEmail(String email) {
//         this.email = email;
//     }    
// }



package com.example.hello.udanthika.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(Long id,String username, String password, String email, String phone) {
        this.id=id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}





