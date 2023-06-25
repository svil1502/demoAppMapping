package com.example.demo.models.dto.request;
import com.example.demo.models.entitys.Media;
import com.example.demo.models.entitys.Question;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionMediaRequestDto {
    private Long id;
    private Question question;
    private Media media;
}
