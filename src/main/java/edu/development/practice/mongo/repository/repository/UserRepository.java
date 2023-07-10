package edu.development.practice.mongo.repository.repository;

import edu.development.practice.mongo.repository.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
