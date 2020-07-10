package com.motion.controller;

import com.motion.data.UserDomain;
import com.motion.reporsitory.MusicRepository;
import com.motion.reporsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository repository;

    @PostMapping
    public ResponseEntity creat(@RequestBody UserDomain user) {

        return ResponseEntity.ok(repository.save(user));
    }

    @GetMapping
    public ResponseEntity find() {

        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping
    public ResponseEntity update(@RequestBody UserDomain user) {

        return ResponseEntity.ok(repository.save(user));
    }

    @DeleteMapping
    public void delete(@RequestBody UserDomain user) {

        repository.delete(user);
    }
}
