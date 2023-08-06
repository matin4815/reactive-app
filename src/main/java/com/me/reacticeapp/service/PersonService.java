package com.me.reacticeapp.service;

import com.me.reacticeapp.dal.entity.Person;
import com.me.reacticeapp.dal.repository.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Mono<Person> savePerson(Person person) {
        return personRepository.save(person);
    }

    public Flux<Person> findAllPeople() {
        return personRepository.findAll();
    }

    public Mono<Person> getPersonById(Long personId) {
        return personRepository.findById(personId);
    }

}
