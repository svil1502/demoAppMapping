package com.example.demo.models.dto.request;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequestDto {
    private Integer position;
    private String question;
    private List<AnswerRequestDto> answers;
    private List<ResultRequestDto> results;
}
