package org.example.homeworkspring02.repository;

import org.apache.ibatis.annotations.*;
import org.example.homeworkspring02.model.Instructor;
import org.example.homeworkspring02.model.InstructorRequest;

import java.util.List;

@Mapper
public interface InstructorRepository {
   @Select("""
    SELECT * FROM instructors
""")
   @Results(id = "instructorMapping", value = {
           @Result(property = "instructorName", column = "instructor_name"),
           @Result(property = "instructorId", column = "instructor_id"),
           @Result(property = "email", column = "email")
   })
   List<Instructor> findAllInstructor();

   //Get Instructor By ID
   @Select(
           """
    SELECT * FROM instructors
    WHERE  instructor_id = #{id}
"""
   )
   @ResultMap("instructorMapping")
   Instructor findInstructorById(Integer id);

   //Insert Instructor
    @Insert("""
    INSERT INTO instructors (instructor_name, email)
    VALUES (DEFAULT, #{instructors.instructorName}, #{instructors.email})
    """
    )
    @ResultMap("instructorMapping")
    void insertInstructor(@Param("instructors") InstructorRequest instructorRequest);


}
