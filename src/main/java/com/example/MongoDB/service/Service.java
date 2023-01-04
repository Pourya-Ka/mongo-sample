package com.example.MongoDB.service;

import com.example.MongoDB.model.Person;
import com.example.MongoDB.repository.Repository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

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
}
