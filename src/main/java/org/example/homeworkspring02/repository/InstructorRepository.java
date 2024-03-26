package org.example.homeworkspring02.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.example.homeworkspring02.model.Instructor;

import java.util.List;

@Mapper
public interface InstructorRepository {
   @Select("""
    SELECT * FROM instructors
""")
   @Result(property = "instructorName", column = "instructor_name")
    List<Instructor> findAllInstructor();
}
