package org.example.homeworkspring02.service.seviceImpl;

import org.apache.ibatis.javassist.NotFoundException;
import org.example.homeworkspring02.model.Instructor;
import org.example.homeworkspring02.model.dto.request.InstructorRequest;

import java.util.List;

public interface InstructorService{
    List<Instructor> getAllInstructor();
    Instructor getInstructorByID(Integer id) throws NotFoundException;

    void insertInstructor(InstructorRequest instructorRequest);


  void updateInstructor(Integer id, InstructorRequest instructorRequest) throws NotFoundException;


    void removeInstructor(Integer id);
}
