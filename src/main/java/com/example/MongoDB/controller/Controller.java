package com.example.MongoDB.controller;

import com.example.MongoDB.model.Person;
import com.example.MongoDB.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persons")
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping()
    public Person savePerson(@RequestBody Person person){
        return service.savePerson(person);
    }
}
