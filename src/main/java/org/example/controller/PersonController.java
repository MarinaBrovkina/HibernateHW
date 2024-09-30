package org.example.controller;

import org.example.entity.Person;
import org.example.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return personRepository.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAgeLessThan(@RequestParam("age") int age) {
        return personRepository.getPersonsByAgeLessThan(age);
    }

    @GetMapping("/persons/by-name-surname")
    public Optional<Person> getPersonByNameAndSurname(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname) {
        return personRepository.getPersonByNameAndSurname(name, surname);
    }
}