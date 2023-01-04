package com.example.MongoDB.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collation = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    @Id
    private String id;
//    @Indexed(name = "meta_url_index_unique",unique = true)
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private List<String> lessons;
    private List<Address> address;

}
