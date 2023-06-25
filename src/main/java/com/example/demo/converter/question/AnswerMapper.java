package com.example.demo.converter.question;

import com.example.demo.converter.DtoMapper;
import com.example.demo.converter.config.ConfigMapper;
import com.example.demo.models.dto.request.AnswerRequestDto;
import com.example.demo.models.entitys.Answer;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(config = ConfigMapper.class)
public interface AnswerMapper extends DtoMapper<AnswerRequestDto, Answer>{
    default List<AnswerRequestDto> toDto(Set<Answer> answers) {
        return toDto(new ArrayList<>(answers));
    }

    default Set<Answer> map(List<Long> answersIds) {
        return answersIds.stream()
                .map(id -> Answer.builder().id(id).build())
                .collect(Collectors.toSet());
    }
}
