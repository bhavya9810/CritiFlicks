package com.platform.CritFlicks.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.platform.CritFlicks.service.response.ReviewResponse;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


@Getter
@Setter
@With
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@ToString
@Table(name="review_table")
public class Review {

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String movieReview;

    private double rating;

    @ManyToOne
    @JoinColumn(name="movie_id",nullable = false)
    @JsonIgnore
    private Movie movie;

    @CreationTimestamp
    private Date createdAt;


    @UpdateTimestamp
    private Date updatedAt;


    public static ReviewResponse toReviewResponse(Review review){
        return ReviewResponse.builder()
                .review(review.movieReview)
                .rating(review.rating)
                .build();
    }
}
