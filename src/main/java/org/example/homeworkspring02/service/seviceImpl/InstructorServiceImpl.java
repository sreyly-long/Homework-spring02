package org.example.homeworkspring02.service.seviceImpl;

import org.example.homeworkspring02.model.Instructor;
import org.example.homeworkspring02.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorServie{
    private final InstructorRepository instructorRepository;
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }
    @Override
    public List<Instructor> getAllInstructor() {
        return instructorRepository.findAllInstructor();
    }

    @Override
    public Instructor getInstructorByID(Integer id) {
        return null;
    }

    @Override
    public void insertInstructor(Instructor instructor) {

    }

    @Override
    public void updateInstructor(Integer id, Instructor instructor) {

    }

    @Override
    public void deleteInstructor(Integer id) {

    }
}
