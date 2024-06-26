package org.example.homeworkspring02.controller;
import org.apache.ibatis.javassist.NotFoundException;
import org.example.homeworkspring02.model.dto.request.ApiResponse;
import org.example.homeworkspring02.model.Instructor;
import org.example.homeworkspring02.model.dto.request.InstructorRequest;
import org.example.homeworkspring02.service.seviceImpl.InstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instructor")
public class InstructorController {
    private final InstructorService instructorService;
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }
    @GetMapping
    public ResponseEntity<?> getAllInstructor(){
        List <Instructor> instructors = instructorService.getAllInstructor();
        return ResponseEntity.ok(instructors);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getInstructorById(@PathVariable Integer id) throws NotFoundException {
        Instructor instructors = instructorService.getInstructorByID(id);
        ApiResponse<Instructor> response = new ApiResponse<>(
                "successfully get instructor",
                HttpStatus.OK,
                200,
                instructors
        );
        return ResponseEntity.ok(response);
    }
    @PostMapping
    public ResponseEntity<?> insertInstructor(@RequestBody InstructorRequest instructorRequest){
        instructorService.insertInstructor(instructorRequest);
        ApiResponse<Instructor> response = new ApiResponse<>(
                "successfully insert instructor",
                HttpStatus.CREATED,
                201,
                null
        );
        return ResponseEntity.ok(response);
    }
    @PutMapping ("/{id}")
    public ResponseEntity<?> updateInstructor(@PathVariable Integer id,
                                              @RequestBody InstructorRequest instructorRequest) throws NotFoundException {
        instructorService.updateInstructor(id,instructorRequest);
        ApiResponse<Instructor> response = new ApiResponse<>(
                "successfully update instructor",
                HttpStatus.OK,
                200,
                null
        );
        return  ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public String removeInstructor(@PathVariable Integer id){
        instructorService.removeInstructor(id);
        return "successfully remove instructor";
    }



}
