package com.me.reacticeapp.controller;

import com.me.reacticeapp.dal.entity.Person;
import com.me.reacticeapp.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping("")
    public Mono<Person> savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("")
    public Flux<Person> getAllPeople() {
        return personService.findAllPeople();
    }

    @GetMapping("/{personId}")
    public Mono<Person> getPersonById(@PathVariable(name = "personId") Long personId) {
        return personService.getPersonById(personId);
    }
}
