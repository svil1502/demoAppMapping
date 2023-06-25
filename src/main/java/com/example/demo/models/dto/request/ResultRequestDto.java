package com.example.demo.models.dto.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultRequestDto {
    Integer countRightAnswer;
    String result;
}
