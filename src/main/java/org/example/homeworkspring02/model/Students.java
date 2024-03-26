package org.example.homeworkspring02.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private Integer id;
    private String studentName;
    private String email;
    private Integer phone_number;
}
