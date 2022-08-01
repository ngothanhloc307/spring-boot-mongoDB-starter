package com.tutorial.springbootmongodb.repository;

import com.tutorial.springbootmongodb.collecttion.Person;
import io.swagger.models.auth.In;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByFistNameStartsWith(String name);

    //List<Person> findByAgeBetween(Integer min, Integer max);

    @Query(value = "{'age': {$gt: ?0, $lt: ?1}}", fields = "{addresses:  0}")
    List<Person> findByAgeBetween(Integer minAge, Integer maxAge);

}
