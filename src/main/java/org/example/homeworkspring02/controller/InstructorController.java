package org.example.homeworkspring02.controller;

import org.example.homeworkspring02.model.Instructor;
import org.example.homeworkspring02.service.seviceImpl.InstructorServie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {
    private final InstructorServie instructorServie;
    public InstructorController(InstructorServie instructorServie) {
        this.instructorServie = instructorServie;
    }
    @GetMapping
    public ResponseEntity<?> getAllInstructor(){
        List <Instructor> instructors = instructorServie.getAllInstructor();
        return ResponseEntity.ok(instructors);
    }


}
