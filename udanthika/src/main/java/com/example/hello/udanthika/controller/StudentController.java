// package com.example.hello.udanthika.controller;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.hello.udanthika.model.Student;
// import com.example.hello.udanthika.service.StudentService;

// @RestController
// @RequestMapping("api/v1/user")
// @CrossOrigin(origins="http://localhost:3000")
// public class StudentController {
//     @Autowired
//     private StudentService ss;
//     @PostMapping("/save")
//     public ResponseEntity<?> saveStudent(@RequestBody Student s)
//     {
//         try{
//             ss.saveStudent(s);
//             return new ResponseEntity<>("registerted",HttpStatus.CREATED);
//         }
//         catch(Exception e)
//         {
//             return new ResponseEntity<>("Something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
//         }
//     }
    
  
// }

// 

// 
package com.example.hello.udanthika.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.udanthika.model.Student;
import com.example.hello.udanthika.service.StudentService;


@RestController
@RequestMapping("api/v1/user")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<?> saveStudent(@RequestBody Student newStudent) {
        try {
            studentService.saveStudent(newStudent);
            return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/update/{email}")
    public ResponseEntity<?> updateStudent(@PathVariable String email, @RequestBody Student student) {
        try {
            return studentService.updateStudent(email, student);
        } catch (Exception e) {
            return new ResponseEntity<>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long Id) {
        try {
            // Call the service method to delete the user
            studentService.deleteStudent(Id);
            return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to delete user", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PatchMapping("/update/{email}")
    public ResponseEntity<?> patchStudent(@PathVariable String email, @RequestBody Student student) {
        try {
            return studentService.patchStudent(email, student);
        } catch (Exception e) {
            return new ResponseEntity<>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}