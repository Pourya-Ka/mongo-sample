package com.example.MongoDB.controller;

import com.example.MongoDB.model.Person;
import com.example.MongoDB.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persons")
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    public List<Person> getAllPerson() {
        return service.getAllPerson();
    }

    @PostMapping()
    public Person savePerson(@RequestBody Person person) {
        return service.savePerson(person);
    }

    @DeleteMapping(path = "{Id}")
    public List<Person> deletePerson(@PathVariable("id") String id){
        return service.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public Person updatePerson(@PathVariable String id, @RequestBody Person person){
        return service.updatePerson(id,person);
    }
}
