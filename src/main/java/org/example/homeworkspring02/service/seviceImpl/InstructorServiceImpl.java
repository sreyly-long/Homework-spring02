package org.example.homeworkspring02.service.seviceImpl;

import org.apache.ibatis.javassist.NotFoundException;
import org.example.homeworkspring02.model.Instructor;
import org.example.homeworkspring02.model.InstructorRequest;
import org.example.homeworkspring02.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService{
    private final InstructorRepository instructorRepository;
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }
    @Override
    public List<Instructor> getAllInstructor() {
        return instructorRepository.findAllInstructor();
    }

    @Override
    public Instructor getInstructorByID(Integer id) throws NotFoundException {
        if ( instructorRepository.findInstructorById(id) == null) {
            throw new NotFoundException("Instructor Does Not Exist");
        }
        return instructorRepository.findInstructorById(id);

    }

    @Override
    public void insertInstructor(InstructorRequest instructorRequest) {
        instructorRepository.insertInstructor(instructorRequest);

    }

    @Override
    public void updateInstructor(Integer id, Instructor instructor) {

    }

    @Override
    public void deleteInstructor(Integer id) {

    }
}
