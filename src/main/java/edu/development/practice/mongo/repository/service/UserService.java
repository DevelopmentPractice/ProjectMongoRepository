package edu.development.practice.mongo.repository.service;

import edu.development.practice.mongo.repository.entity.User;
import edu.development.practice.mongo.repository.request.UserRequest;

public interface UserService {

    User insert(UserRequest request);

}
