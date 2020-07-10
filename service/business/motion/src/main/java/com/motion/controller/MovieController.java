package com.motion.controller;


import com.motion.data.MovieDomain;
import com.motion.reporsitory.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieRepository repository;

    @PostMapping
    public ResponseEntity creat(@RequestBody MovieDomain movie){

        return ResponseEntity.ok(repository.save(movie));
    }
    @GetMapping
    public ResponseEntity find(){

        return ResponseEntity.ok(repository.findAll());
    }
    @PutMapping
    public ResponseEntity update(@RequestBody MovieDomain movie){

        return ResponseEntity.ok(repository.save(movie));
    }
    @DeleteMapping
    public void delete(@RequestBody MovieDomain movie){

        repository.delete(movie);
    }




}
