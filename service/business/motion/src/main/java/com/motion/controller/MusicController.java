package com.motion.controller;

import com.motion.data.MovieDomain;
import com.motion.data.MusicDomain;
import com.motion.reporsitory.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/music")
public class MusicController {


    @Autowired
    MusicRepository repository;
    @PostMapping
    public ResponseEntity creat(@RequestBody MusicDomain music){

        return ResponseEntity.ok(repository.save(music));
    }
    @GetMapping
    public ResponseEntity find(){

        return ResponseEntity.ok(repository.findAll());
    }
    @PutMapping
    public ResponseEntity update(@RequestBody MusicDomain music){

        return ResponseEntity.ok(repository.save(music));
    }
    @DeleteMapping
    public void delete(@RequestBody MusicDomain music){

        repository.delete(music);
    }
}
