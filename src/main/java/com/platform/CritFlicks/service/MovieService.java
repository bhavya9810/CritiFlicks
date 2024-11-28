package com.platform.CritFlicks.service;

import com.platform.CritFlicks.domain.Movie;
import com.platform.CritFlicks.repository.MovieRepository;
import com.platform.CritFlicks.service.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public MovieResponse findMovieByTitle(String title){
            Movie movie=this.movieRepository.findByTitle(title);

            if(Objects.nonNull(movie)){
           return movie.toMovieResponse();
            }

            return null;
    }


}
