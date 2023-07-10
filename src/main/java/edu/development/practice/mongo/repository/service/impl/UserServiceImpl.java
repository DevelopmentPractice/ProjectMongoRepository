package edu.development.practice.mongo.repository.service.impl;

import edu.development.practice.mongo.repository.entity.User;
import edu.development.practice.mongo.repository.repository.UserRepository;
import edu.development.practice.mongo.repository.request.UserRequest;
import edu.development.practice.mongo.repository.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public User insert(UserRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());

        return userRepository.insert(user);
    }
}
