package com.platform.CritFlicks.controller;

import com.platform.CritFlicks.domain.Movie;
import com.platform.CritFlicks.service.MovieService;
import com.platform.CritFlicks.service.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


@GetMapping("/title")
    public MovieResponse findMovie(String title){
    return movieService.findMovieByTitle(title);
    }
}
