package com.platform.CritFlicks.service;

import com.platform.CritFlicks.domain.Movie;
import com.platform.CritFlicks.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final MovieRepository movieRepository;

    @Autowired
    public AdminService(
                        MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie){
       return movieRepository.save(movie);
    }
}
