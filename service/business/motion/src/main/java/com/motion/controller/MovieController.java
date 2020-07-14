package com.motion.controller;


import com.motion.data.MovieDomain;
import com.motion.reporsitory.MovieRepository;
import com.motion.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieRepository repository;

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity creat(@RequestBody MovieDomain movie){

        return ResponseEntity.ok(repository.save(movie));
    }

    @GetMapping("/find/")
    public ResponseEntity find(){

        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/findlike/{id}")
    public ResponseEntity findNumberOfActualLike(@PathVariable int id) {
        int likeNumber = movieService.getLikeValue(id);
        return ResponseEntity.ok(likeNumber);
    }

    @PutMapping("/addlike/{id}")
    public void addOneLikeToMovie(@PathVariable int id) {
        movieService.addLikeToMovieByReference(id);
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
