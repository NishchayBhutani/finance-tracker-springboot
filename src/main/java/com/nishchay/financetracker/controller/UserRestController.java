package com.nishchay.financetracker.controller;

import com.nishchay.financetracker.dto.CreateUserRequest;
import com.nishchay.financetracker.dto.GetUserResponse;
import com.nishchay.financetracker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<GetUserResponse> createUser(@RequestBody CreateUserRequest createUserRequest) {
        return new ResponseEntity<>(userService.create(createUserRequest), HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<GetUserResponse> getUserById(@PathVariable long userId) {
        return new ResponseEntity<>(userService.get(userId), HttpStatus.OK);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<GetUserResponse> updateUser(@PathVariable long userId, @RequestBody CreateUserRequest createUserRequest) {
        return new ResponseEntity<>(userService.update(userId, createUserRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUserById(@PathVariable long userId) {
        userService.delete(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
