package com.tutorial.springbootmongodb.repository;

import com.tutorial.springbootmongodb.collecttion.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String> {
}
