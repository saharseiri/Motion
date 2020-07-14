package com.motion.service;

import com.motion.data.MovieDomain;
import com.motion.reporsitory.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void addNewMovie(String movieName, Date dateproduct) {
        MovieDomain movieDomain = new MovieDomain();
        movieDomain.setMovieName(movieName);
        movieDomain.setDateproduct(dateproduct);
        movieDomain.setCount(movieDomain.getCount()+1);
        movieRepository.save(movieDomain);
    }

    public void addLikeToMovieByReference( int movieReference) {
        Optional<MovieDomain> actualMovieDomain = movieRepository.findById(movieReference);
        actualMovieDomain.get().setCount(actualMovieDomain.get().getCount()+1);
        movieRepository.save(actualMovieDomain.get());
    }

    public int getLikeValue(int movieReference) {
        Optional<MovieDomain> movieDomain =  movieRepository.findById(movieReference);
        return movieDomain.get().getCount();
    }
}
