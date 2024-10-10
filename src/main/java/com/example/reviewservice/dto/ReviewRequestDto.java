package com.example.reviewservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDto {

    private Long userId;
    private Integer score;
    private String content;
}
