package edu.development.practice.mongo.repository.controller;

import edu.development.practice.mongo.repository.entity.User;
import edu.development.practice.mongo.repository.request.UserRequest;
import edu.development.practice.mongo.repository.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/insert")
    public ResponseEntity<User> insert(@RequestBody UserRequest request) {
        return new ResponseEntity<>(userService.insert(request), HttpStatus.OK);
    }
}
