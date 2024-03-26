package org.example.homeworkspring02.service.seviceImpl;

import org.example.homeworkspring02.model.Instructor;

import java.util.List;

public interface InstructorServie{
    List<Instructor> getAllInstructor();
    Instructor getInstructorByID(Integer id);

    void insertInstructor(Instructor instructor);
    void updateInstructor(Integer id, Instructor instructor);
    void deleteInstructor(Integer id);
}
