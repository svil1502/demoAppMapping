package com.example.demo.models.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnswerRequestDto {
    String answer;
    Boolean isRight;
}
