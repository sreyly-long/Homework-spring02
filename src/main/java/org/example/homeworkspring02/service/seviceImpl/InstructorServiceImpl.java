package org.example.homeworkspring02.service.seviceImpl;

import org.apache.ibatis.javassist.NotFoundException;
import org.example.homeworkspring02.model.Instructor;
import org.example.homeworkspring02.model.dto.request.InstructorRequest;
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
    public void updateInstructor(Integer id, InstructorRequest instructorRequest) throws NotFoundException {
        if (instructorRepository.findInstructorById(id) == null){
            throw new NotFoundException ("Instructor does not exist");
        }
        instructorRepository.updateInstructor(id,instructorRequest);

    }

    @Override
    public void removeInstructor(Integer id) {
        boolean isRemove = instructorRepository.removeInstructor(id);
        System.out.println(isRemove);


    }
}
