package com.example.MongoDB.service;

import com.example.MongoDB.model.Person;
import com.example.MongoDB.repository.Repository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public Person savePerson(Person person) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("address").is(person.getAddress()));
//        if ((repository.findByAddress(person.getAddress())).isEmpty()) {//        }
////        throw new IllegalStateException(
////                "this address is exist!!!"
////        );
        return repository.save(person);

    }
    public List<Person> getAllPerson(){
        return repository.findAll();
    }

    public List<Person> deletePerson(String id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    public Person updatePerson(String id, Person person) {
        Person user =  repository.findById(id).orElseThrow(() -> new IllegalStateException(
                "student with id " + id + " does not exist!"
        ));
        repository.deleteById(id);
        user.setAddress(person.getAddress());
        user.setAge(person.getAge());
        user.setGender(person.getGender());
        user.setLessons(person.getLessons());
        user.setFirstName(person.getFirstName());
        user.setLastName(person.getLastName());
        return repository.save(user);
    }
}
