package com.example.demo.converter.question;

import com.example.demo.converter.DtoMapper;
import com.example.demo.converter.config.ConfigMapper;
import com.example.demo.models.dto.request.AnswerRequestDto;
import com.example.demo.models.dto.request.QuestionRequestDto;
import com.example.demo.models.dto.request.ResultRequestDto;
import com.example.demo.models.entitys.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = ConfigMapper.class, uses = {AnswerMapper.class, ResultMapper.class})
public interface QuestionMapper extends DtoMapper<QuestionRequestDto, Question> {

    QuestionRequestDto toDto(Question question);

    default QuestionRequestDto toDto(Question question,
                                     List<AnswerRequestDto> answers,
                                     List<ResultRequestDto> results) {
        QuestionRequestDto questionRequestDto = toDto(question);
        questionRequestDto.setAnswers(answers);
        questionRequestDto.setResults(results);
        return questionRequestDto;
    }
}
