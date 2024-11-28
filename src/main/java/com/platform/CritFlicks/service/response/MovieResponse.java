package com.platform.CritFlicks.service.response;


import com.platform.CritFlicks.domain.Genre;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieResponse {

private String title;
private Genre genre;
private Double rating;
private List<ReviewResponse> reviews;

}
