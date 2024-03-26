package org.example.homeworkspring02.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
    private Integer instructorId;
    private String instructorName;
    private String email;
}
