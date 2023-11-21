package com.example.validation;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person){
        System.out.println("Person saved: " + person);
    }

    public Person getPersonByEmployeeId(int empolyeeId) {
        return new Person();
    }
}
