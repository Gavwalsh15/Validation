package com.example.validation;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService){this.personService = personService;}

    @GetMapping("/{empolyeeId}")
    public ResponseEntity<?> getPerson(@PathVariable int empolyeeId){
        if(empolyeeId > 0){
            return ResponseEntity.badRequest().body("Employee ID is blank");
        }

        Person person = personService.getPersonByEmployeeId(empolyeeId);

        if(person == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(person);
    }

    @PostMapping("/createPerson")
    public ResponseEntity<String>create(@Valid @RequestBody Person person){
        personService.savePerson(person);
        return new ResponseEntity<>("Person created successfully\n\n" + person, HttpStatus.OK);
    }
}
