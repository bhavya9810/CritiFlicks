package com.platform.CritFlicks.domain;

import com.platform.CritFlicks.service.response.MovieResponse;
import com.platform.CritFlicks.service.response.ReviewResponse;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@Builder
@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Table(name="movie_table")
public class Movie {

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

@Enumerated(EnumType.STRING)
    private Genre genre;

private double rating;

@OneToMany(mappedBy = "movie")
private List<Review> reviews;

public MovieResponse toMovieResponse(){
    return MovieResponse.builder()
            .genre(this.genre)
            .title(this.title)
            .reviews(this.reviews.stream()
                             .map(review -> review.toReviewResponse(review))
                    .collect(Collectors.toList()) )

            .build();
}
}
