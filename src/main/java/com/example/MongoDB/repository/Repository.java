package com.example.MongoDB.repository;

import com.example.MongoDB.model.Address;
import com.example.MongoDB.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<Person,String> {
    List<Person> findByAddress(List<Address> address);
}
