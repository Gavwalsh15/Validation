package com.example.validation;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name Cannot be Blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @Email(message = "Invalid email address")
    private String email;

    @NegativeOrZero(message = "Employee Id cannot be negative or zero")
    @NotNull(message = "ID cannot be blank")
    private int employeeId;

    @NegativeOrZero(message = "Age cannot be negative or zero")
    @NotNull(message = "Age cannot be blank")
    private int age;

    @NotBlank(message = "Position Cannot be Blank")
    @Size(min = 2, max = 50, message = "Position must be between 2 and 50 characters")
    private String position;

    @NotBlank(message = "Name Cannot be Blank")
    @Size(min = 2, max = 50, message = "Department must be between 2 and 50 characters")
    private String department;
}
