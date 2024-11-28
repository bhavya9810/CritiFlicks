package com.platform.CritFlicks.service.response;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewResponse {

    private String review;
    private Double rating;

}
