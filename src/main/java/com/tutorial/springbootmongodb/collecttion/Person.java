package com.tutorial.springbootmongodb.collecttion;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Builder
@Document(collection = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {

    @Id
    private String personId;
    private String fistName;
    private String lastName;
    private Integer age;
    private List<String> hobbies;
    private List<Address> addresses;

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                ", addresses=" + addresses +
                '}';
    }
}
