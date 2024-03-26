package org.example.homeworkspring02.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse <T> {
    private String message;
    private HttpStatus status;
    private Integer code;

    private T payload;


}
